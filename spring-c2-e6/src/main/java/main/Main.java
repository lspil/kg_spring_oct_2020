package main;

import config.ProjectConfig;
import model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.BookManagementService;

public class Main {

  public static void main(String[] args) {
    /**
     * Pentru metodele care fac modificari din service sa adaugati un log inainte si dupa
     * apelul metodei care sa scrie
     *
     * Begin transaction
     *
     * Daca nu a aparut o exceptie -> CommitTransaction
     * Daca metoda a aruncat exceptie -> RollbackTransaction
     *
     * @Transaction
     */

    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service = c.getBean(BookManagementService.class);

    Book b = new Book();
    b.setAuthor("Someone");
    b.setTitle("Something");

    service.addBook(b);
  }
}
