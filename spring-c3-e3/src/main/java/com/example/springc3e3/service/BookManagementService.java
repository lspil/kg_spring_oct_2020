package com.example.springc3e3.service;



import com.example.springc3e3.model.Book;
import com.example.springc3e3.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookManagementService {

  private final BookRepository bookRepository;

  public BookManagementService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public void addBook(Book book) {
    bookRepository.addBook(book);
  }

  public List<Book> listBooks() {
    return bookRepository.listBooks();
  }

  public List<Book> findBooksByTitle(String title) {
    return bookRepository.listBooks().stream()
                .filter(b -> b.getTitle().contains(title))
                .collect(Collectors.toList());
  }
}
