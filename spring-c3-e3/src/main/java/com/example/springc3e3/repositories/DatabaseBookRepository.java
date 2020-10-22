package com.example.springc3e3.repositories;

import com.example.springc3e3.model.Book;
import com.example.springc3e3.repositories.mappers.BookMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class DatabaseBookRepository implements BookRepository {

  private final JdbcTemplate jdbc;

  public DatabaseBookRepository(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  @Override
  public void addBook(Book book) {
    String sql = "INSERT INTO book VALUES (NULL, ?, ?)";
    jdbc.update(sql, book.getTitle(), book.getAuthor());
  }

  @Override
  public List<Book> listBooks() {
    String sql = "SELECT * FROM book";
    return jdbc.query(sql, new BookMapper());
  }
}
