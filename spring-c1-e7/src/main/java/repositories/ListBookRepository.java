package repositories;

import model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ListBookRepository implements BookRepository {

  private List<Book> bookList = new ArrayList<>();

  public void addBook(Book book) {
    bookList.add(book);
  }

  public List<Book> listBooks() {
    return bookList;
  }
}
