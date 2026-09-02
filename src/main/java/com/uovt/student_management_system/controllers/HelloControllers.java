package com.uovt.student_management_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
    public class HelloControllers {

        @GetMapping("/hello")
        public String hello() {
            return "Hello World!";
        }
    }

