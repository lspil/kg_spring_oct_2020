package com.example.springc3e3.controllers;

import com.example.springc3e3.model.Book;
import com.example.springc3e3.service.BookManagementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

  private final BookManagementService bookService;

  public BookController(BookManagementService bookService) {
    this.bookService = bookService;
  }

  @PostMapping
  public void addBook(@RequestBody Book book) {
    bookService.addBook(book);
  }

  @GetMapping
  public List<Book> listBooks() {
    return bookService.listBooks();
  }

  @GetMapping("/{title}")
  public List<Book> findBooksByTitle(@PathVariable String title) {
    return bookService.findBooksByTitle(title);
  }
}
