package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class HelloController {

  @Value("${person.lastName}")
     private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello"+name;
    }
}
