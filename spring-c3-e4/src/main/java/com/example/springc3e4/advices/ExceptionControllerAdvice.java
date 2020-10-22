package com.example.springc3e4.advices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

  @ExceptionHandler(RuntimeException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ExceptionResponse failWithRuntimeException() {
    return new ExceptionResponse("Nothing to see in here ;)");
  }
}
