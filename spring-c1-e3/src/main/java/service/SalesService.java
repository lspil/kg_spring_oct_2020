package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

@Service
public class SalesService {

  private final ProductRepository productRepository;

//  @Autowired
  public SalesService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public void saleProduct() {
    // Omitted code
    productRepository.changeProductQuantity();
  }

//  @Autowired
//  public void setProductRepository(ProductRepository productRepository) {
//    this.productRepository = productRepository;
//  }
}
