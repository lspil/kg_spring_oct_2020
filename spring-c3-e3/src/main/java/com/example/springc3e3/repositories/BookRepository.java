package com.example.springc3e3.repositories;


import com.example.springc3e3.model.Book;

import java.util.List;

public interface BookRepository {

  void addBook(Book book);
  List<Book> listBooks();
}
