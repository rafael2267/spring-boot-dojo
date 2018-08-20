package com.gods.plans.actions.actionsapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.gods.plans")
public class ActionsApplication {


  public static void main(String[] args) {
    SpringApplication.run(ActionsApplication.class, args);
  }
}
