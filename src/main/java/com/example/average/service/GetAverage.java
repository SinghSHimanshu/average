package com.example.average.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class GetAverage {
    public String getAverage(List<String> f){
        double sum = 0;
        for (String string : f) {
            sum+=Double.parseDouble(string);
        }
        return String.valueOf(sum/f.size());
    }
}
