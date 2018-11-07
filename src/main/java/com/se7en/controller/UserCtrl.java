package com.se7en.controller;

import com.se7en.entity.User;
import com.se7en.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author se7en
 * @Date 10/25 0025 22:30
 * @VERSION 1.0
 */
@RestController
@RequestMapping("user")
public class UserCtrl {

  private final static Logger logger = LoggerFactory.getLogger(UserCtrl.class);

  @Autowired
  private UserRepository userRepository;

  @RequestMapping("/all")
  public List<User> queryAllUsers(){
    logger.info("所有用户...");
    return userRepository.findAll();
  }
}
