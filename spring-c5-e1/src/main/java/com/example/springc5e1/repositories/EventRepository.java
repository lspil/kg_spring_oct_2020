package com.example.springc5e1.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class EventRepository {

  public void saveEvent() {
    System.out.println("Save event!");
  }
}
