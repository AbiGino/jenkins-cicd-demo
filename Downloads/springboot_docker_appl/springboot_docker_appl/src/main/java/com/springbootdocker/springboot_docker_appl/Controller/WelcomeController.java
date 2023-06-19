package com.springbootdocker.springboot_docker_appl.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class WelcomeController {
    @GetMapping("/sample")
    public String getMsg(){
        return "Hello world";
    }
}
