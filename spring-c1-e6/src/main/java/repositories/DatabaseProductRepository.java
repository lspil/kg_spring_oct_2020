package repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("DATABASE")
public class DatabaseProductRepository implements ProductRepository {

  @Override
  public void changeProductQuantity() {
    System.out.println("Changing product quantity in database...");
  }

}
