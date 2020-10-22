package com.example.springc4e2.repositories;

import com.example.springc4e2.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
