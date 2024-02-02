package com.example.springtest.controller;

import com.example.springtest.entity.ConvertDto;
import com.example.springtest.entity.EnumTest;
import com.example.springtest.entity.FieldNoOrder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/convertController")
public class ConvertController {

    @PostMapping("/convert")
    public String convert(@RequestBody ConvertDto convertDto){
        return "convert";
    }

    @GetMapping("/convertGet")
    public String convertGet(ConvertDto<FieldNoOrder> convertDto){
        return "convertGet";
    }

    @GetMapping("/enumTest")
    public String enumTest(EnumTest enumTest){
        return "enumTest";
    }

}
