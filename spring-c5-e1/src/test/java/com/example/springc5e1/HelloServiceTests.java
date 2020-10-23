package com.example.springc5e1;

import com.example.springc5e1.config.ProjectConfig;
import com.example.springc5e1.repositories.EventRepository;
import com.example.springc5e1.service.HelloService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class HelloServiceTests {

  @Autowired
  private HelloService helloService;

  @MockBean
  private EventRepository eventRepository;

  @Test
  public void helloTest() {
    var res = helloService.hello();

    assertEquals("Hello", res);

    verify(eventRepository).saveEvent();
  }
}
