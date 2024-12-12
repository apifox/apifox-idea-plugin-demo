package com.example.springtest.controller;

import com.example.springtest.anno.ParamType;
import com.example.springtest.entity.JavaValiData;
import com.example.springtest.entity.OpenApiData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/JavaValidateController")
public class JavaValidateController {

    @GetMapping("/fileParam")
    public String fileParam(JavaValiData javaValiData){
        return null;
    }

    @GetMapping("/fileFormData")
    public String fileFormData(@ModelAttribute JavaValiData javaValiData){
        return "fileFormData";
    }

    @GetMapping("/fileJsonBody")
    public String fileJsonBody(@RequestBody JavaValiData javaValiData){
        return "fileFormData";
    }

    /**
     * @methodType application/x-www-form-urlencoded
     * @return
     */
    @PostMapping("/filewwwUrl")
    public OpenApiData filewwwUrl(@ParamType("form") JavaValiData javaValiData){
        return null;
    }

}
