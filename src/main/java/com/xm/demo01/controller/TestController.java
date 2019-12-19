package com.xm.demo01.controller;

import com.xm.demo01.service.TestService;
import com.xm.demo01.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private UserService userService;

    @Value("${test.name}")
    private  String name;

    @RequestMapping(value="/hello")
    public String hello(){
        return "hello World !";
    }

    @RequestMapping(value = "/test500")
    public String testError(){
        int i = 3/0 ;
        return "test 500";
    }

    @RequestMapping(value = "testdev")
    public String testdev(){
        return  testService.toSend();
    }
    @RequestMapping(value = "getValue")
    public String getName(){return name;}

    @RequestMapping(value = "/index.action")
    public String index(){
        log.info("跳转index页面");
        return "/index";
   }

   @RequestMapping(value = "/welcome")
    public String welcome(Model model){
        model.addAttribute("name",name);
        return "/page/welcome";
   }

   @RequestMapping(value = "/test/register")
    public String register(){
        return null;
   }



}
