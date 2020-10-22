package com.example.springc3e3.controllers.advices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public String exceptionHandle() {
    return "Error!";
  }
}
