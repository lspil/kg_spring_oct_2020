package com.example.springc3e5.controllers;

import com.example.springc3e5.model.Product;
import com.example.springc3e5.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping
  public void addProduct(@RequestBody Product p) {
    productService.addProduct(p);
  }

  @GetMapping
  public List<Product> getAllProducts() {
    return productService.getAllProducts();
  }
}
