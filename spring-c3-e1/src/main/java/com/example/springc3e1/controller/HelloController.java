package com.example.springc3e1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

//  @RequestMapping(path = "/hello", method = RequestMethod.GET)
  @GetMapping("/hello")
  public String hello() {
    return "hello.html";
  }
}
