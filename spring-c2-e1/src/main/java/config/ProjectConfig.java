package config;

import beans.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ProjectConfig {

  @Bean
  @Lazy
  public Foo foo() {
    return new Foo();
  }
}
