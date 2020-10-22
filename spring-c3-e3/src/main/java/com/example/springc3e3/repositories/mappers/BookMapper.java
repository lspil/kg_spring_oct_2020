package com.example.springc3e3.repositories.mappers;

import com.example.springc3e3.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {

  @Override
  public Book mapRow(ResultSet resultSet, int i) throws SQLException {
    Book b = new Book();
    b.setTitle(resultSet.getString("title"));
    b.setAuthor(resultSet.getString("author"));
    return b;
  }
}
