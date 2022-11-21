package com.example.demoAPI;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private UserController controller;

    @Test
    public void controllerReturnsSomething()
            throws Exception {
        assertThat(controller).isNotNull();
    }



}