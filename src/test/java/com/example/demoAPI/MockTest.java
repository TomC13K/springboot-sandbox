package com.example.demoAPI;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class MockTest {

    //annotation, not decorator
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createEmployeeAPI() throws Exception
    {
        mockMvc.perform( MockMvcRequestBuilders
                        .post("/api/userName")
                        .content(asJsonString(new UserModel("Johny", "Waaaa", 10, 20)))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.employeeId").exists());
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

/*
@ExtendWith(MockitoExtension.class)
//@RunWith(JUnitPlatform.class)
public class MockTest
{

    @InjectMocks
    UserController userController;

    @Mock
    UserService service;

    @Test
    public void testAddEmployee()
    {
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

        when(employeeDAO.addEmployee(any(UserModel.class))).thenReturn(true);

        UserModel user = new UserModel();
        user.name = "Lokesh";
        user.surname = "lkllk";
        user.age = 11;
        user.age2 = 22;


        ResponseEntity<UserModel> responseEntity = userController.postBody(user);

        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
        //assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
    }

}
*/

