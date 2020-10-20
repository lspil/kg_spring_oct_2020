package main;

import beans.Foo;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    // eager vs lazy instantiation
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    var foo = c.getBean(Foo.class);

    System.out.println(foo.getClass()); // beans.Foo
  }
}
