package com.example.springc4e2.services;

import com.example.springc4e2.entities.Account;
import com.example.springc4e2.entities.Client;
import com.example.springc4e2.repositories.AccountRepository;
import com.example.springc4e2.repositories.ClientRepository;
import com.example.springc4e2.services.exceptions.NonExistentAccountException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@Transactional
public class AccountService {

  private final AccountRepository accountRepository;
  private final ClientRepository clientRepository;

  public AccountService(AccountRepository accountRepository,
                        ClientRepository clientRepository) {
    this.accountRepository = accountRepository;
    this.clientRepository = clientRepository;
  }

  public void addClient(Client client) {
    clientRepository.save(client);
  }

  public void addAccount(Account account) {
    var client = clientRepository
        .findById(account.getClient().getId());

    var c = client.orElseThrow(NonExistentAccountException::new);

    account.setClient(c);

    accountRepository.save(account);
  }

  // ACID

  /**
   * Propagation
   *
   * REQUIRED  (default)
   * REQUIRES_NEW
   * SUPPORTS
   * NOT_SUPPORTED
   * MANDATORY
   * NEVER
   * NESTED
   *
   * Isolation
   *
   * READ_UNCOMMITTED   (cel mai putin izolat)
   * READ_COMMITTED
   * REPEATABLE_READ
   * SERIALIZABLE  (cel mai izolat)
   *
   * dirty reads, repeatable reads, phantom reads
   */

  @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
  public void transferMoney(String from, String to, BigDecimal value) {
    var fromAccount = accountRepository.findAccountByCode(from);
    var toAccount = accountRepository.findAccountByCode(to);

    var fa = fromAccount.orElseThrow(NonExistentAccountException::new);
    var ta = toAccount.orElseThrow(NonExistentAccountException::new);

    fa.setAmount(fa.getAmount().subtract(value));
    ta.setAmount(ta.getAmount().add(value));
  }
}
