package com.example.springc3e2.controllers;

import com.example.springc3e2.dto.Cat;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class DemoController {

  @GetMapping("/exemplu1")
  public Cat exemplu1() {
    Cat cat = new Cat();
    cat.setName("Tom");
    cat.setAge(3);
    return cat;
  }

  @GetMapping("/exemplu2")
  public Cat exemplu2(HttpServletResponse response) {
    response.setStatus(HttpServletResponse.SC_CREATED);
    response.addHeader("message", "Luke, I'm your father!");

    Cat cat = new Cat();
    cat.setName("Tom");
    cat.setAge(3);
    return cat;
  }

  @GetMapping("/exemplu3")
  public Cat exemplu3(@RequestBody Cat cat) {
    return cat;
  }

  @GetMapping("/exemplu4/{name}/{age}")
  public Cat exemplu4(@PathVariable String name,
                      @PathVariable int age) {
    Cat cat = new Cat();
    cat.setName(name);
    cat.setAge(age);
    return cat;
  }

  @GetMapping("/exemplu5")
  public Cat exemplu5(@RequestParam String name,
                      @RequestParam int age) {
    Cat cat = new Cat();
    cat.setName(name);
    cat.setAge(age);
    return cat;
  }
}
