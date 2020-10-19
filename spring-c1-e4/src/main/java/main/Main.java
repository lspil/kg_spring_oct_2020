package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;
import service.SalesService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

//    SalesService service1 = c.getBean("salesService1", SalesService.class);
//    SalesService service2 = c.getBean("salesService2", SalesService.class);
//
//    System.out.println(service1.toString());
//    System.out.println(service2.toString());
//    System.out.println(service1 == service2); // true

    ProductRepository productRepository1 = c.getBean(ProductRepository.class);
    ProductRepository productRepository2 = c.getBean(ProductRepository.class);

    System.out.println(productRepository1 == productRepository2);
  }
}
