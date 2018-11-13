package com.se7en;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description TODO
 * @Author se7en
 * @Date 10/25 0025 21:43
 * @VERSION 1.0
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
        // 是否启动权限验证
        // org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class,args);
  }

}
