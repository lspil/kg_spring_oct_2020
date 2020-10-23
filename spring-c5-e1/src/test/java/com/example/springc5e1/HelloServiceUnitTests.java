package com.example.springc5e1;

import com.example.springc5e1.repositories.EventRepository;
import com.example.springc5e1.service.HelloService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HelloServiceUnitTests {

  @Test
  public void helloServiceTest() {
    var eventRepository = mock(EventRepository.class);

    HelloService helloService = new HelloService(eventRepository);

    var res = helloService.hello();

    assertEquals("Hello", res);

    verify(eventRepository).saveEvent();
  }
}
