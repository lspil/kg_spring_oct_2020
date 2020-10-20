package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ProductService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service1 = c.getBean(ProductService.class);
    var service2 = c.getBean(ProductService.class);

    service1.addProduct();

    System.out.println(service1.getClass()); // service.ProductService$$EnhancedBySpring...
    System.out.println(service2.getClass());
  }
}
