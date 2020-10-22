package com.example.springc4e2.controllers;

import com.example.springc4e2.dto.Transfer;
import com.example.springc4e2.entities.Account;
import com.example.springc4e2.entities.Client;
import com.example.springc4e2.services.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

  private final AccountService accountService;

  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @PostMapping("/client")
  public void addClient(@RequestBody Client client) {
    accountService.addClient(client);
  }

  @PostMapping("/account")
  public void addAccount(@RequestBody Account account) {
    accountService.addAccount(account);
  }

  @PostMapping("/transfer")
  public void transferMoney(@RequestBody Transfer transfer) {
    accountService.transferMoney(transfer.getFrom(), transfer.getTo(), transfer.getValue());
  }
}
