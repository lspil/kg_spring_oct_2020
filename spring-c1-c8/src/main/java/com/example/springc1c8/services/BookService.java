package com.example.springc1c8.services;

import com.example.springc1c8.entities.Book;
import com.example.springc1c8.repositories.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BookService {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public void addBook(Book b) {
    System.out.println("BR: " + bookRepository.getClass());
    bookRepository.save(b);
  }
}
