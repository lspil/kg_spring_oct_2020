package com.example.springc4e2.repositories;

import com.example.springc4e2.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {

  @Query("SELECT a FROM Account a WHERE a.code = :code")
  Optional<Account> findAccountByCode(String code);
}
