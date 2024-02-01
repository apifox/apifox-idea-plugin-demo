package com.example.springtest.controller;

import com.example.springtest.anno.ParamIgnore;
import com.example.springtest.anno.ParamRequest;
import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/paramRequestController")
public class ParamRequestController {

    @GetMapping("/paramRequestControllerNoChange")
    public String paramRequestControllerNoChange(String id, String sex, User user){
        return "paramRequestControllerNoChange";
    }

    @GetMapping("/paramRequestControllerChange")
    public String paramRequestControllerChange(@ParamRequest String id, String sex, @ParamRequest User user){
        return "paramRequestControllerChange";
    }

}
