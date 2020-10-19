package config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import repositories.ProductRepository;
import service.SalesService;

@Configuration
@ComponentScan(basePackages = {"service", "repositories"})
public class ProjectConfig {

  @Bean
  public SalesService salesService1() {
    return new SalesService(); // singleton
  }

  @Bean
  public SalesService salesService2() {
    return new SalesService(); // singleton
  }

  @Bean
  @Scope(BeanDefinition.SCOPE_PROTOTYPE)
  public ProductRepository productRepository() {
    return new ProductRepository();
  }
}
