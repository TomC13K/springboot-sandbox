package com.example.oopdemo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/api/{paramWord}")
    public String returnAnyString(@RequestParam(required = false) String paramWord) {
        System.out.println("in the anyString fn");
        return  paramWord.toUpperCase();
    }
    //factory pattern then adapter
}
