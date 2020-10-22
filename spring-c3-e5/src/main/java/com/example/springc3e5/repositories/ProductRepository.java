package com.example.springc3e5.repositories;

import com.example.springc3e5.model.Product;

import java.util.List;

public interface ProductRepository {

  void addProduct(Product p);
  List<Product> getAllProducts();
}
