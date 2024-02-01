package com.example.springtest.controller;

import com.example.springtest.anno.Header;
import com.example.springtest.anno.Token;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/methodAdditionParam")
public class MethodAdditionParam {

    @GetMapping("/methodAdditionParams")
    public String methodAdditionParams(){
        return "methodAdditionParamsDoc";
    }

    /**
     * @token
     * @return
     */
    @GetMapping("/methodAdditionParamsDoc")
    public String methodAdditionParamsDoc(){
        return "methodAdditionParamsDoc";
    }

    @Token
    @GetMapping("/methodAdditionParamsAnno")
    public String methodAdditionParamsAnno(){
        return "methodAdditionParamsDoc";
    }

}
