package service;

import aspects.ToLog;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

  @ToLog
  public void addProduct() {
    System.out.println("Adding product..."); // use case
  }

  public void getProduct() {
    System.out.println("Getting product...");
  }
}
