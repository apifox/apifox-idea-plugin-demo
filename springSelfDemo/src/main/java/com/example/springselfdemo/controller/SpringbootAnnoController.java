package com.example.springselfdemo.controller;

import com.example.springselfdemo.anno.SelfIsSpringController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SelfIsSpringController("文件名字自定义qxd")
@RequestMapping("/springbootAnnoController")
public class SpringbootAnnoController {

    @PostMapping("/postMapping")
    public String hello(){
        return "hello";
    }

}
