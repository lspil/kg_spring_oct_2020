package config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import repositories.ProductRepository;
import service.SalesService;

@Configuration
@ComponentScan(basePackages = {"service", "repositories"})
public class ProjectConfig {

}
