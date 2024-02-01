package com.example.springtest.controller;

import com.example.springtest.anno.Ignore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Ignore
@RestController
@RequestMapping(value = "/ignoreClassAnnoController")
public class IgnoreClassAnnoController {

    @GetMapping("/ignore")
    public String ignore(){
        return "ignore";
    }

}
