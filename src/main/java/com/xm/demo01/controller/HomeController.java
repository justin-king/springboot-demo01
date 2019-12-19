package com.xm.demo01.controller;

import com.xm.demo01.model.User;
import com.xm.demo01.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
@Slf4j
@Api(tags = "demo控制器")
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/index.action")
    @ApiOperation("跳转首页")
    public String index(){
        User user = new User();
        user.setId(000000000000000000001);
        user.setName("zhangsna");
        user.setAge(20);
        userService.addUser(user);
        return "/index";
    }

}
