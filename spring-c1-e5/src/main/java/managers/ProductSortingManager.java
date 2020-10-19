package managers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import repositories.ProductRepository;

import java.util.Collections;
import java.util.List;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ProductSortingManager {

  @Autowired
  private ProductRepository productRepository;

  private List<String> products;

  public void setProducts(List<String> products) {
    this.products = products;
  }

  public void sortProducts() {
    Collections.sort(products);
  }

  public List<String> getProducts() {
    return products;
  }
}
