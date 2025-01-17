package com.example.springtest.controller;

import com.example.springtest.entity.Case;
import com.example.springtest.entity.FieldDefaultDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/fieldDefaultValueController")
public class FieldDefaultValueController {


    @PostMapping("/fieldDefaultValue")
    public String fieldDefaultValue(@RequestBody List<FieldDefaultDto<Case>> fieldDefaultDto){
        return "fieldDefaultValueController";
    }

    @PostMapping("/fieldExampleValue")
    public String fieldExampleValue(FieldDefaultDto fieldDefaultDto){
        return "fieldExampleValue";
    }

    @GetMapping("/fieldExampleValueGet")
    public String fieldExampleValueGet(FieldDefaultDto fieldDefaultDto){
        return "fieldExampleValue";
    }

    @GetMapping("/fieldDefaultValueGet")
    public String fieldDefaultValueGet(@RequestBody FieldDefaultDto fieldDefaultDto){
        return "fieldDefaultValueController";
    }

    @GetMapping("/fieldDefaultValueGetRead")
    public FieldDefaultDto fieldDefaultValueGetRead(@RequestBody FieldDefaultDto fieldDefaultDto){
        return null;
    }

}
