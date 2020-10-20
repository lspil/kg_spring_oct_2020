package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ProductService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var service1 = c.getBean(ProductService.class);
    var service2 = c.getBean(ProductService.class);

    String res = service1.addProduct("chocolate");

    System.out.println(res); // null
  }
}
