package com.example.springtest.controller;

import com.example.springselfdemo.controller.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDiffModelController extends BaseController {

    @GetMapping("/testUrl")
    private String testUrl(){
        return "";
    }

}
