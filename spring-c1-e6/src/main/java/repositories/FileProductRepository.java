package repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("FILE")
public class FileProductRepository implements ProductRepository {

  @Override
  public void changeProductQuantity() {
    System.out.println("Changing product quantity in file...");
  }

}
