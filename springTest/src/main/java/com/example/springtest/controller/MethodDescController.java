package com.example.springtest.controller;

import com.example.springtest.anno.Desc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/methodDescController")
public class MethodDescController {

    /**
     * 名字1
     * @desc doc描述
     */
    @GetMapping("/methodDescClassDoc")
    public String methodDescClassDoc(){
        return "methodDescClassDoc";
    }

    /**
     * 名字2
     * @return
     */
    @GetMapping("/methodDescClassAnno")
    @Desc("注解描述")
    public String methodDescClassAnno(){
        return "methodDescClassAnno";
    }

}
