package repositories;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

  public void changeProductQuantity() {
    System.out.println("Changing product quantity..." + toString());
  }

}
