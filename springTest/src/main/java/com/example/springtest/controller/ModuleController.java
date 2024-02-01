package com.example.springtest.controller;

import com.example.springtest.anno.Module;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @module Spring
 */
@RestController
@RequestMapping(value = "/moduleClass")
public class ModuleController {

    @GetMapping("/dataModule")
    public String dataModule(){
        return "ignore";
    }

    /**
     * @module SpringModule
     */
    @GetMapping("/SpringModule")
    public String SpringModule(){
        return "ignore";
    }

    @Module("moduleSpringAnno")
    @GetMapping("/moduleSpringAnno")
    public String moduleSpringAnno(){
        return "ignore";
    }

}
