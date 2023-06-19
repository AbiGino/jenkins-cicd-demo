package com.demo.jenkinspipelinedemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jenkins")
public class WelcomeController {

    @GetMapping("/jenkins-pipeline")
    public String getMsg(){
        return "Hi, welcome to jenkins tutorial..";
    }
}
