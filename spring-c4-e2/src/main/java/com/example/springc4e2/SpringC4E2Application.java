package com.example.springc4e2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringC4E2Application {

  /**
   *
   * Client -> name
   * Account -> code (UUID)
   *         -> amount
   *
   * Use cases
   *
   *   add client
   *   add account
   *   transferMoney
   *
   *
   */
  public static void main(String[] args) {
    SpringApplication.run(SpringC4E2Application.class, args);
  }

}
