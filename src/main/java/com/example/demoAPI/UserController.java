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
    @Autowired
    private UserRepository userRepository;;

    @GetMapping("/")
    public String returnString() {
        logger.info("Root URL");
        logger.debug("debug message");
        logger.error("no error for error message");
        return "Hello World";
    }

    @GetMapping("/{name}")   // api/<something>
    @ResponseBody
    public ResponseEntity<Object> returnAnyString(@PathVariable("name") String name) {
        return new ResponseEntity<>(service.returnAsUpperCase(name),HttpStatus.OK);
    }

    // when using PARAM id  after
    @GetMapping("/foo")      // api/foo?id=xxxxx"
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }

    @PostMapping("/userName")
    public ResponseEntity<UserModel> postBody(@Valid @RequestBody UserModel user) {

        UserEntity n = new UserEntity();
        n.setName(user.name);
        n.setSurname(user.surname);
        n.setAge(user.age);
        n.setAge2(user.age2);

        try {
            userRepository.save(n);
        }catch (Exception er) {
            logger.error("Couldnt write user to a DB \n" + er);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
