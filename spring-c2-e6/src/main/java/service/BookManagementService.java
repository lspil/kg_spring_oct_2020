package service;

import aspects.Transaction;
import model.Book;
import org.springframework.stereotype.Service;
import repositories.BookRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookManagementService {

  private final BookRepository bookRepository;

  public BookManagementService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Transaction
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
