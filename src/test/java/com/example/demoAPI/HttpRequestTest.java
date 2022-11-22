package com.example.demoAPI;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;   //why this needs to be here??? namespace ??
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

 // This sytarts the server !!! not best way for unit tests

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)    // uses random port so no issues with testing env
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void defaultUrlShouldReturnHelloWorld() throws Exception {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/",
//                String.class)).contains("Hello World");
    }
//
//    @Test
//    public void urlPathShouldReturnGivenUrlPathNameCapitalized() throws Exception {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/seven",
//                String.class)).contains("SEVEN");
//    }
}
