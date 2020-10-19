package service;

import org.springframework.beans.factory.annotation.Autowired;
import repositories.ProductRepository;

public class SalesService {

  @Autowired
  private ProductRepository productRepository;

  public void saleProduct() {
    // Omitted code
    productRepository.changeProductQuantity();
  }
}
