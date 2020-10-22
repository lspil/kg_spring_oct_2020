package com.example.springc3e5.repositories;

import com.example.springc3e5.model.Product;
import com.example.springc3e5.repositories.mappers.ProductMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class SQLProductRepository implements ProductRepository {

  private final JdbcTemplate jdbc;

  public SQLProductRepository(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  @Override
  public void addProduct(Product p) {
    String sql = "INSERT INTO product VALUES (NULL, ?)";
    jdbc.update(sql, p.getName());
  }

  @Override
  public List<Product> getAllProducts() {
    String sql = "SELECT * FROM product";
    return jdbc.query(sql, new ProductMapper());
  }
}
