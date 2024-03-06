package com.example.springselfdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;

public class BaseController {

    @GetMapping("/base")
    private String baseUrl(){
        return "string";
    }

}
