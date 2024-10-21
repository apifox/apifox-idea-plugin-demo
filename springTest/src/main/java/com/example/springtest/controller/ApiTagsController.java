package com.example.springtest.controller;

import com.example.springtest.anno.ApiTag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apiTagsController")
public class ApiTagsController {

    /**
     * @tags tag1,tag2
     * @return
     */
    @GetMapping({"/apiTagsControllerDocTag1","apiTagsControllerDocTag2"})
    public String apiTagsControllerDoc(){
        return "apiNameClass";
    }

    @ApiTag("tag3,tag4")
    @GetMapping("/apiTagsControllerAnno")
    public String apiTagsControllerAnno(){
        return "apiNameClass";
    }

}
