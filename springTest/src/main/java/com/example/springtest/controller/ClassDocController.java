package com.example.springtest.controller;

import com.example.springtest.anno.ClassDoc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件名称
 * @folder folder名字
 */
@RestController
@RequestMapping("/className")
@ClassDoc("classDoc")
public class ClassDocController {

    @GetMapping("/classDocTest")
    public String classDocTest(){
        return "classDocController";
    }


}
