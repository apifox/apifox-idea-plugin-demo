package com.example.springtest.controller;

import com.example.springtest.anno.Ignore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ignoreMethodController")
public class IgnoreMethodController {

    /**
     * @ignore
     */
    @GetMapping("/ignoreMethodDoc")
    public String ignoreMethodDoc(){
        return "ignore";
    }

    @Ignore
    @GetMapping("/ignoreMethodAnno")
    public String ignoreMethodAnno(){
        return "ignore";
    }

    @GetMapping("/notIgnoreMethod")
    public String notIgnoreMethod(){
        return "ignore";
    }

}
