package com.example.springtest.controller;

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



}
