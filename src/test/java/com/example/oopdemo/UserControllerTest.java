package com.example.oopdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;


// not starting the server
@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(UserController.class)            // using only web layer + can specify the controller
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void defaultUrlReturnsHelloWorld() throws Exception {
        this.mockMvc.perform(get("/api/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }

    @Test
    public void returnsCapitalizedUrlPathName() throws Exception {
        this.mockMvc.perform(get("/api/olala"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("OLALA"));
    }

}
