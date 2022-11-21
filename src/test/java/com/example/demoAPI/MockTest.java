package com.example.demoAPI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


// Fails to start, some default profile error
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@WebMvcTest
public class MockTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void mockRootPath_ReturnsHelloWorld() throws Exception
    {
        try {
        mockMvc.perform(get("/api"))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string(containsString("Hello World")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

