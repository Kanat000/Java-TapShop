package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {
    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }
    @GetMapping("/adminPanel")
    public String adminPanel(){
        return "AdminPage";
    }
    @GetMapping("/sayhello")
    public String sayHello(){
        return "Hello";
    }
}
