package com.example.springc1c8.repositories;

import com.example.springc1c8.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
