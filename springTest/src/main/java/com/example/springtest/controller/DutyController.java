package com.example.springtest.controller;

import com.example.springtest.anno.MethodDuty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classDuty stack
 */
@RestController
@RequestMapping(value = "/dutyController")
public class DutyController {


    @GetMapping("/dutyClassDoc")
    public String dutyClassDoc(){
        return "dutyClassDoc";
    }

    /**
     * @methodDuty vinzhang
     * @return
     */
    @GetMapping("/dutyMethodDoc")
    public String dutyMethodDoc(){
        return "dutyMethodDoc";
    }

    @MethodDuty("vinzhang")
    @GetMapping("/dutyMethodAnno")
    public String dutyMethodAnno(){
        return "dutyMethodAnno";
    }


}
