package com.example.springc4e1.controllers;

import com.example.springc4e1.entities.Product;
import com.example.springc4e1.repositories.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

  private final ProductRepository productRepository;

  public ProductController(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @PostMapping
  public void addProduct(@RequestBody Product p) {
    productRepository.save(p);
  }
}
