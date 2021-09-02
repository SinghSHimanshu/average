package com.example.average.controller;

import java.util.List;

import com.example.average.service.GetAverageService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@RestController
public class AverageController{
    @Autowired
    private GetAverageService getAverageService;
    
    @PostMapping(value = "/average")
    public ResponseEntity<String> getAverage(@RequestParam List<String> f){
        return ResponseEntity.status(200).body(getAverageService.getGetAverage().getAverage(f));
    }

    @PostMapping(value = "/averageTB", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getAverageTB(@RequestBody List<String> f){
        return ResponseEntity.status(200).body(getAverageService.getGetAverage().getAverage(f));
    }
}