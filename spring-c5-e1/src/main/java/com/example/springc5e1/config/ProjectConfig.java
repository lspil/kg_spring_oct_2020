package com.example.springc5e1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
/**
 * @PreAuthorize
 * @PostAuthorize
 * @PreFilter
 * @PostFilter
 */
public class ProjectConfig extends WebSecurityConfigurerAdapter {
  /**
   *
   * Authorization:
   *  - endpoint (HTTP filter)
   *  - method (aspect)
   *
   */

  @Bean
  public UserDetailsService userDetailsService() {
    var uds = new InMemoryUserDetailsManager();

    var u1 = User.withUsername("bill")
        .password("12345")
        .roles("MANAGER") // authorities("ROLE_MANAGER")
        .build();

    var u2 = User.withUsername("john")
        .password("12345")
        .authorities("write")
        .build();

    uds.createUser(u1);
    uds.createUser(u2);

    return uds;
  }

  @Bean // BCrypt
  public PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance(); //new BCryptPasswordEncoder();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.httpBasic(); // DSL method

    http.csrf(c -> c.ignoringAntMatchers("/smth")); // nu pe GET

    // abc.com      api.abc.com
    // abc.com   -->    meth()
    //           <--
    http.authorizeRequests()
//          .mvcMatchers("/hello").hasAuthority("read")
//          .mvcMatchers("/ciao").hasAuthority("write")
          .anyRequest().permitAll();

  }
}
