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
    @GetMapping({"/methodReturnOneDocFirstDoc","/methodReturnThreeDoc"})
    public User methodReturnOneDocFirstDoc(){
        return null;
    }

    @UrlType("first")
    @GetMapping({"/methodReturnOneDocFirstAnno","/methodReturnThreeAnno"})
    public User methodReturnOneDocFirstAnno(){
        return null;
    }

    /**
     * @urlType last
     */
    @GetMapping({"/methodReturnOneDoc","/methodReturnThreeDoc","/methodReturnLastDoc"})
    public User methodReturnOneDocLastDoc(){
        return null;
    }

    @UrlType("last")
    @GetMapping({"/methodReturnOneDocFirstAnno","/methodReturnThreeAnno","/methodReturnLastAnno"})
    public User methodReturnOneDocLastAnno(){
        return null;
    }

    /**
     * @urlType all
     */
    @GetMapping({"/methodReturnOneDoc","/methodReturnThreeDoc","/methodReturnLastDoc"})
    public User methodReturnOneDocAllDoc(){
        return null;
    }

    @UrlType("all")
    @GetMapping({"/methodReturnOneDocFirstAnno","/methodReturnThreeAnno","/methodReturnLastAnno"})
    public User methodReturnOneDocAllAnno(){
        return null;
    }




}
