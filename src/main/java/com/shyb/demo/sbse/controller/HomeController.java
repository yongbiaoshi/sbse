package com.shyb.demo.sbse.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(){
        LocalDateTime now = LocalDateTime.now();
        return "现在时间：" + now.toString();
    }
}
