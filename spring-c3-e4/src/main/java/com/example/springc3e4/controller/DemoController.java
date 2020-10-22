package com.example.springc3e4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/demo/{n}")
  public void demo(@PathVariable int n) {
    if (n > 10) {
      throw new RuntimeException(":(");
    }
  }
}
