package com.se7en.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author se7en
 * @Date 10/25 0025 21:58
 * @VERSION 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloCtrl {
  @GetMapping("")
  public String helloWorld(){
    return "hello world!";
  }
}
