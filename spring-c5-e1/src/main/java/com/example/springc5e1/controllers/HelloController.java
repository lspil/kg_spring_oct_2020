package com.example.springc5e1.controllers;

import com.example.springc5e1.service.HelloService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final HelloService helloService;

  public HelloController(HelloService helloService) {
    this.helloService = helloService;
  }

  @GetMapping("/hello")
  @PreAuthorize("@mySecurityService.test()")
  public String hello() {
    return helloService.hello();
  }

  @GetMapping("/ciao")
  public String ciao() {
    return "Ciao!";
  }

  @GetMapping("/hola")
  public String hola() {
    return "Hola!";
  }

  @PostMapping("/smth")
  public void doSmth() {
    System.out.println(":)");
  }
}
