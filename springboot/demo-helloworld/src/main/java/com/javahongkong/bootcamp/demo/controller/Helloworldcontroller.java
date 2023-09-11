package com.javahongkong.bootcamp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@RequestMapping(value = "/api/v1") // version 1api set
public class Helloworldcontroller {
  
  @GetMapping(value = "/helloworld")
  public String helloworld(){
    return "Hello world. I am patrick.";
  }

}
