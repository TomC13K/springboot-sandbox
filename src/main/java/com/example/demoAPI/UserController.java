package com.example.demoAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String returnString() {
        return "Hello World";
    }

    // when using the PATH name
    @GetMapping("/{name}")
    @ResponseBody
    public ResponseEntity<Object> returnAnyString(@PathVariable("name") String name) {
        return new ResponseEntity<>(service.returnAsUpperCase(name),HttpStatus.OK);
    }

    // when using PARAM id  after  "/api/foo?id=xxxxx"
    @GetMapping("/foo")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }

    @PostMapping("/userName")
    public ResponseEntity<UserModel> postBody(@Valid @RequestBody UserModel user) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }

}
