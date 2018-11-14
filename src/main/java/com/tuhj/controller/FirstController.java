package com.tuhj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "HelloWord SpringBoot!!!    ########";
    }
}


