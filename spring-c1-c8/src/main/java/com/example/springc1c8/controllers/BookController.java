package com.example.springc1c8.controllers;

import com.example.springc1c8.entities.Book;
import com.example.springc1c8.services.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  private final BookService service;

  public BookController(BookService service) {
    this.service = service;
  }

  @PostMapping("/book")
  public void addBook(@RequestBody Book book) {
    System.out.println("BS:" + service.getClass());
    service.addBook(book);
  }
}
