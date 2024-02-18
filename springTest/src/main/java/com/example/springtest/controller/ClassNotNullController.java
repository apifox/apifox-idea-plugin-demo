package com.example.springtest.controller;


import com.example.springtest.entity.ClassDataAll;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/classNotNullController")
public class ClassNotNullController {

    @GetMapping("/classNotNull")
    public String classNotNull(ClassDataAll classDataAll){
        return "classNotNull";
    }

}
