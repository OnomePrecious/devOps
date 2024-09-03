package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Hello {
    @GetMapping("/hello")
        public String helloWorld(){
        return "Hello, World!";
    }
}
