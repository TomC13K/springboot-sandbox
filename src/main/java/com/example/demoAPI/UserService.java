package com.example.demoAPI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
        n.name = user.name;
        n.surname = user.surname;
        n.age = user.age;
        n.age2 = user.age2;

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

    public String getUserByID(Integer id) {
        Optional<UserEntity> studentResponse =  userRepository.findById(id);
        UserEntity user = studentResponse.get();
        String output = String.format("Hi %s, %s, you are %s year old",user.name,user.surname,user.age);
        return output;
    }

}

