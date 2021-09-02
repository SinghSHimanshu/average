package com.example.average.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class AverageControllerTest {
    @Autowired
    private RestTemplate testRestTemplate;
    
    @Test
    public void testGetAverage(){
        final String url = "http://localhost:8081/average?f=0.2f,9.0f";
        //Assertions.assertEquals("4.6", 
        //float[] input = {0.2f,9.0f};
        //System.out.println(testRestTemplate.getForEntity(url, String.class).getBody());//);
    }
}
