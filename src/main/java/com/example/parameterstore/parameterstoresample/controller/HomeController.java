package com.example.parameterstore.parameterstoresample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping(value = "/")
public class HomeController {

  private Logger logger = LoggerFactory.getLogger(HomeController.class);

  @Value("${username}")
  private String username;

  @Value("${db.password}")
  private String cpassword;

  @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
  public String home(Locale locale) {
    logger.info("username: "+username);
    logger.info("cpassword: "+cpassword);
    return "Home";
  }
}
