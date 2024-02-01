package com.example.springtest.controller;

import com.example.springtest.anno.ApiName;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apiNameClass")
public class ApiNameController {

    /**
     * @api.name APINAME_TEST
     * @return
     */
    @GetMapping("/apiNameClassDoc")
    public String apiNameClassDoc(){
        return "apiNameClass";
    }

    @ApiName("apiNameClassAnno")
    @GetMapping("/apiNameClassAnno")
    public String apiNameClassAnno(){
        return "apiNameClass";
    }

}
