package config;

import aspects.TransactionAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"repositories", "service"})
public class ProjectConfig {

  @Bean
  public TransactionAspect transactionAspect() {
    return new TransactionAspect();
  }
}
