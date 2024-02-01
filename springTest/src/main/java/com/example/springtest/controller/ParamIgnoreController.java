package com.example.springtest.controller;

import com.example.springtest.anno.ParamIgnore;
import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/paramIgnoreController")
public class ParamIgnoreController {

    @GetMapping("/paramIgnoreNoChange")
    public String paramIgnoreNoChange(String id, String sex, User user){
        return "paramIgnoreNoChange";
    }

    @GetMapping("/paramIgnoreChange")
    public String paramIgnoreChange(@ParamIgnore String id,String sex,@ParamIgnore User user){
        return "paramIgnoreNoChange";
    }

}
