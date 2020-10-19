package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class SalesService {

  @Autowired
  private ProductRepository productRepository;

  public void saleProduct() {
    // Omitted code
    productRepository.changeProductQuantity();
  }
}
