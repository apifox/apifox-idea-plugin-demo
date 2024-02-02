package com.example.springtest.controller;

import com.example.springtest.anno.ApiAfter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/methodFilterController")
public class MethodFilterController {

    @GetMapping("/api")
    private String api(){
        return "api";
    }

    @GetMapping("/apiAfterAnno")
    @ApiAfter
    private String apiAfterAnno(){
        return "apiAfterAnno";
    }

    /**
     * @apiAfter
     * @return
     */
    @GetMapping("/apiAfterDoc")
    private String apiAfterDoc(){
        return "apiAfterDoc";
    }

}
