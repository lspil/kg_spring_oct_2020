package com.example.springc5e1.service;

import com.example.springc5e1.repositories.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

  private final EventRepository eventRepository;

  public HelloService(EventRepository eventRepository) {
    this.eventRepository = eventRepository;
  }

  public String hello() {
    eventRepository.saveEvent();
    return "Hello";
  }
}
