package com.example.springc3e2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salut")  // prefix
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "HELLO!";
  }

  @GetMapping("/ciao")
  public String ciao() {
    return "CIAO!";
  }
}
