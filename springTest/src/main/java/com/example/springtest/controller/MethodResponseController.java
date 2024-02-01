package com.example.springtest.controller;

import com.example.springtest.anno.RequestCase;
import com.example.springtest.anno.ResponseCase;
import com.example.springtest.entity.Case;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/methodResponseController")
public class MethodResponseController {

    @GetMapping("/noChangeCaseClassAnno")
    public Case noChangeCaseClassAnno(Case user){
        return null;
    }

    /**
     * @responseCase snakeCase
     * @return
     */
    @GetMapping("/snakeCaseClassDoc")
    public Case snakeCaseClassDoc(Case user){
        return null;
    }

    @ResponseCase("snakeCase")
    @GetMapping("/snakeCaseClassAnno")
    public Case snakeCaseClassAnno(Case user){
        return null;
    }



}
