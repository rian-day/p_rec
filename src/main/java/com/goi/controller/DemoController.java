package com.goi.controller;

import com.goi.core.base.BaseController;
import com.goi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@CrossOrigin
public class DemoController extends BaseController{
    @Autowired
    UserService userService;

    @RequestMapping(value = {"demo","/","index"})
    public int demo(){
        return userService.checkUser("1","1");
    }
}
