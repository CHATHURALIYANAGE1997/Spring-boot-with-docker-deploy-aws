package com.example.springbootdockeraws.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://44.210.141.60:3000")
public class MainController {
    @RequestMapping(path = "/")
    public String index(){
        return "Spring-boot-docker-aws";
    }
}
