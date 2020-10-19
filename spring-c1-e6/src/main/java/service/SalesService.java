package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import repositories.DatabaseProductRepository;
import repositories.ProductRepository;

@Service
public class SalesService {

  @Autowired
  @Qualifier("FILE")
  private ProductRepository productRepository;

  public void saleProduct() {
    productRepository.changeProductQuantity();
  }

}
