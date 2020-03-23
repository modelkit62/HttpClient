package com.example.httpclientdemo.controller;

import com.example.httpclientdemo.model.Location;
import com.example.httpclientdemo.service.HttpClientDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HttpClientDemoController {

    @Autowired
    HttpClientDemoService httpClientDemoService;

    @GetMapping
    public List<Location> getData(){
        return httpClientDemoService.getTodasLocation();
    }

}
