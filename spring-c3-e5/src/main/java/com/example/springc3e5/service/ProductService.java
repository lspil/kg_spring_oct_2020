package com.example.springc3e5.service;

import com.example.springc3e5.model.Product;
import com.example.springc3e5.repositories.ProductRepository;
import com.example.springc3e5.repositories.mappers.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public void addProduct(Product p) {
    productRepository.addProduct(p);
  }

  public List<Product> getAllProducts() {
    return productRepository.getAllProducts();
  }
}
