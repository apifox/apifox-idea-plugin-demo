package com.example.springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ignore
 */
@RestController
@RequestMapping(value = "/ignoreClassController")
public class IgnoreClassDocController {

    @GetMapping("/ignore")
    public String ignore(){
        return "ignore";
    }

}
