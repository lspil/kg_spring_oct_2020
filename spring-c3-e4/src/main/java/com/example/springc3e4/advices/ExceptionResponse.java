package com.example.springc3e4.advices;

public class ExceptionResponse {

  private String message;

  public ExceptionResponse(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
