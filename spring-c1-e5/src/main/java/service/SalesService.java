package service;

import managers.ProductSortingManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import repositories.ProductRepository;

import java.util.List;

@Service
public class SalesService {

  @Autowired
  private ApplicationContext applicationContext;

  public void saleProduct() {
    List<String> productsList = List.of("beer", "chocolate");

    ProductSortingManager productSortingManager =
      applicationContext.getBean(ProductSortingManager.class);

    productSortingManager.setProducts(productsList);
    productSortingManager.sortProducts();
    productsList = productSortingManager.getProducts();
  }

}
