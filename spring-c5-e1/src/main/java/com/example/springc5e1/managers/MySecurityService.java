package com.example.springc5e1.managers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class MySecurityService implements AuthorizationRule {

  public boolean test() {
    Authentication s = SecurityContextHolder.getContext().getAuthentication();
    return true;
  }
}
