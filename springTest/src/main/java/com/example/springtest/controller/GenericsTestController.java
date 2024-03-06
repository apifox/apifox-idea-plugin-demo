package com.example.springtest.controller;

import com.example.springtest.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试泛型
 */
@RestController
@RequestMapping("/genericsTestController")
public class GenericsTestController {

    /**
     * 测试入参有泛型
     */
    @GetMapping("/genericsTestParam")
    public String genericsTestParam(@RequestBody R<GenericsParam<Generics>> genericsR){
        return "genericsTestParam";
    }


    /**
     * 测试返回值有泛型
     */
    @GetMapping("/genericsTestReturn")
    public R<GenericsReturn<Generics>> genericsTestReturn(@RequestBody String genericsR){
        return null;
    }

    /**
     * 测试返回值和入参都有泛型
     */
    @GetMapping("/genericsTestReturnAndParam")
    public R<GenericsReturn<Generics>> genericsTestReturnAndParam(@RequestBody R<GenericsParam<Generics>>  genericsR){
        return null;
    }
}
