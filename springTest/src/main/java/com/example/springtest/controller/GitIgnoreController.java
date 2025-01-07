package com.example.springtest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/GitIgnoreController")
public class GitIgnoreController {

    @GetMapping("/gitIgnoreMethod")
    public String gitIgnoreMethod() {
        return "gitIgnoreMethod";
    }

}
