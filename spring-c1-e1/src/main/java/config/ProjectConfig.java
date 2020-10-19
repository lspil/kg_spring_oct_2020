package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.ProductRepository;
import service.SalesService;

@Configuration
public class ProjectConfig {

  @Bean
  public ProductRepository productRepository() {
    return new ProductRepository();
  }

  @Bean
  public SalesService salesService() {
    return new SalesService();
  }
}
