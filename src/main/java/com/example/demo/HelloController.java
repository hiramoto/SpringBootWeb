package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController 
{
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello world!";
    }
}