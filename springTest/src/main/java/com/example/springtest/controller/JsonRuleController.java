package com.example.springtest.controller;

import com.example.springtest.entity.JsonRuleData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jsonRuleController")
public class JsonRuleController {

    @GetMapping("/jsonRule")
    public String jsonRule(@RequestBody  JsonRuleData jsonRuleData){
        return "ignore";
    }

}
