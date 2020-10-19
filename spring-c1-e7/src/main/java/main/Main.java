package main;

import config.ProjectConfig;
import model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BookManagementService;

public class Main {

  public static void main(String[] args) {
    /**
     * Book
     *   - title (unique)
     *   - author
     *
     * Repository: List<Book>
     *
     * Service
     *  addBook(Book book)
     *  listBooks()
     *  findBookByTitle(String title)   --> contains in title
     */

    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = c.getBean(BookManagementService.class);

    Book b = new Book();
    b.setAuthor("Someone");
    b.setTitle("Something");

    service.addBook(b);
  }
}
