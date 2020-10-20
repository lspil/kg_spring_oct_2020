package service;

import org.springframework.stereotype.Service;


@Service
public class ProductService {

  public String addProduct(String product) {
    System.out.println("Adding product... " + product); // use case
    return "PRODUCT";
  }
}
