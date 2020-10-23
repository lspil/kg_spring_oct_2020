package com.example.springc5e1;

import com.example.springc5e1.repositories.EventRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private EventRepository eventRepository;

  @Test
  @DisplayName("Aici trebuie scrisa descrierea testului")
  void test1() throws Exception {
    mockMvc.perform(
          get("/hello"))
        .andExpect(status().isOk())
        .andExpect(content().string("Hello"));

    verify(eventRepository).saveEvent();
  }

}
