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

    @GetMapping("/api/{name}")
    @ResponseBody
    //public String returnAnyString(@RequestParam String name) {    //param  ?name=lalala
    public String returnAnyString(@PathVariable("name") String name) {
        System.out.println("in the anyString fn");
        return  name.toUpperCase();
    }
    //factory pattern then adapter
}
