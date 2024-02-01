package com.example.springtest.controller;

import com.example.springtest.anno.RequestCase;
import com.example.springtest.entity.Case;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/methodRequestReplace")
public class MethodRequestController {

    /**
     * @requestCase snakeCase
     * @return
     */
    @GetMapping("/snakeCaseClassDoc")
    public String snakeCaseClassDoc(Case user){
        return "snakeCase";
    }

    @RequestCase("snakeCase")
    @GetMapping("/snakeCaseClassAnno")
    public String snakeCaseClassAnno(Case user){
        return "snakeCase";
    }

    @GetMapping("/noChangeCaseClassAnno")
    public String noChangeCaseClassAnno(Case user){
        return "noChangeCaseClassAnno";
    }

}
