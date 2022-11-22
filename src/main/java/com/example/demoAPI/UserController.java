package com.example.demoAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String returnString() {
        logger.info("Root URL");
        logger.debug("debug message");
        logger.warn("warning message");
        logger.error("no error for error message");
        return "Hello World";
    }

    @GetMapping("/{name}")   // api/<something>
    @ResponseBody
    public ResponseEntity<Object> returnAnyString(@PathVariable("name") String name) {
        return new ResponseEntity<>(service.returnAsUpperCase(name),HttpStatus.OK);
    }

    @GetMapping("/foo")      // api/foo?id=xxxxx"
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }

    @PostMapping("/userName")
    public ResponseEntity<UserModel> postBody(@Valid @RequestBody UserModel user) {
        service.createUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/getUsers")   // api/<something>
    @ResponseBody
    public ResponseEntity<Object> getAllUsers() {
        return new ResponseEntity<>(service.getAllUsers(),HttpStatus.OK);
    }

}
