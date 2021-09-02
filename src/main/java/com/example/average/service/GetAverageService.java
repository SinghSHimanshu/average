package com.example.average.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  

@Service
public class GetAverageService{
    @Autowired
    GetAverage getAverage;
    public GetAverage getGetAverage() {
        return getAverage;
    }
    public GetAverageService(GetAverage getAverage){
        this.getAverage = getAverage;
    }
    public GetAverageService() {
    }

}