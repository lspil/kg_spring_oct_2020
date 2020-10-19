package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;
import service.SalesService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    SalesService service = c.getBean(SalesService.class);
    ProductRepository repository = c.getBean(ProductRepository.class);

    service.saleProduct();

    System.out.println(service.toString());
    System.out.println(repository.toString());
  }
}
