package com.example.springtest.controller;

import com.example.springselfdemo.entity.DiffModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDiffSameModelController extends TestDiffModelController{

    @GetMapping("/testUrlSame")
    private String testUrlSame(DiffModel diffModel){
        return "";
    }

}
