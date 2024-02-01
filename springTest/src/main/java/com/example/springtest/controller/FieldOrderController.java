package com.example.springtest.controller;

import com.example.springtest.entity.FieldNoOrder;
import com.example.springtest.entity.FieldOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fieldOrderController")
public class FieldOrderController {

    @GetMapping("/fieldOrderControllerNoOrder")
    public String fieldOrderControllerNoOrder(FieldOrder fieldOrder){
        return "fieldOrderControllerNoOrder";
    }

    @GetMapping("/fieldOrderControllerOrder")
    public String fieldOrderControllerOrder(FieldNoOrder fieldNoOrder){
        return "fieldOrderControllerOrder";
    }

}
