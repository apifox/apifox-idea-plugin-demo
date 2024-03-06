package com.example.springtest.controller;

import com.example.springtest.anno.UrlType;
import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pathMultiController")
public class PathMultiController {

    @GetMapping({"/methodReturnOne","/methodReturnTwo"})
    public User methodReturnOne(){
        return null;
    }

    /**
     * @urlType first
     */
    @GetMapping({"/methodReturnOneDocFirstDoc","/methodReturnOneDocTwoDoc"})
    public User methodReturnOneDocFirstDoc(){
        return null;
    }

    @UrlType("first")
    @GetMapping({"/methodReturnOneDocFirstAnno","/methodReturnOneDocTwoAnno"})
    public User methodReturnOneDocFirstAnno(){
        return null;
    }

    /**
     * @urlType last
     */
    @GetMapping({"/methodReturnOneDocLastDoc","/methodReturnTwoDocLastDoc","/methodReturnThreeDocLastDoc"})
    public User methodReturnOneDocLastDoc(){
        return null;
    }

    @UrlType("last")
    @GetMapping({"/methodReturnOneDocLastAnno","/methodReturnTwoDocLastAnno","/methodReturnLastDocLastAnno"})
    public User methodReturnOneDocLastAnno(){
        return null;
    }

    /**
     * @urlType all
     */
    @GetMapping({"/methodReturnOneDocAllDoc","/methodReturnTwoDocAllDoc","/methodReturnThreeDocAllDoc"})
    public User methodReturnOneDocAllDoc(){
        return null;
    }

    @UrlType("all")
    @GetMapping({"/methodReturnOneDocAllAnno","/methodReturnTwoDocAllAnno","/methodReturnLastDocAllAnno"})
    public User methodReturnOneDocAllAnno(){
        return null;
    }




}
