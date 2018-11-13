package com.se7en.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description TODO
 * @Author se7en
 * @Date 11/13 0013 22:42
 * @VERSION 1.0
 */
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.formLogin()
            .and()
            .authorizeRequests()
            .anyRequest()
            .authenticated();

  }
}
