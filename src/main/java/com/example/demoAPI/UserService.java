package com.example.demoAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public String returnAsUpperCase(String name) {
        System.out.println("in the anyString fn");
        return name.toUpperCase();
    }

    public String createUser(UserModel user) {
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
        return "done";
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel returnUser(UserModel user) {
        System.out.println("in the anyString fn--"); //logger
        return user;
    }


}

