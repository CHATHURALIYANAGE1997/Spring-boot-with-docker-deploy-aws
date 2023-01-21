package com.example.springbootdockeraws.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping(path = "/")
    public String index(){
        return "Spring-boot-docker-aws";
    }
}