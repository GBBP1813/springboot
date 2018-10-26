package com.example.springbootweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class helloController {

    @ResponseBody
    @RequestMapping("/hello")
    public  String hello(){
        return "HWLLO";
    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        map.put("users", Arrays.asList("zhangshan","lisi","wangwu"));
        return "success";
    }
    @RequestMapping({"/","login.html"})
    public  String toLogin(){
        return "login";
    }

/*    @RequestMapping({"/","Dashboard.html"})
  public String toIndex(){
      return "Dashboard";
  }*/

}
