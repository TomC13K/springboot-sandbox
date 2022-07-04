package com.example.oopdemo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    private final RandomService randomService;

    public ControllerClass(RandomService randomService) {
        this.randomService = randomService;
    }

    @GetMapping("/")
    public String returnString() {
        return "Hello World";
    }

    //factory pattern then adapter
}
