package com.example.springc4e2.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String code = UUID.randomUUID().toString();

  private BigDecimal amount;

  @ManyToOne
  @JoinColumn(name = "client")
  private Client client;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
