package com.example.ymlrule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apiNameClass")
public class ApiNameController {

    @GetMapping("/apiNameClassDoc")
    public String apiNameClassDoc(){
        return "apiNameClass";
    }

    @GetMapping("/apiNameClassAnno")
    public String apiNameClassAnno(){
        return "apiNameClass";
    }

}
