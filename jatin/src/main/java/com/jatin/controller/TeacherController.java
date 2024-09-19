package com.jatin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @RequestMapping("/teacher")
    public String sayHelloAgain() {
        return "Say";
    }
}
