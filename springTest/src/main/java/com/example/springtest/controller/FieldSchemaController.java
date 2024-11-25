package com.example.springtest.controller;

import com.example.springtest.anno.ParamType;
import com.example.springtest.entity.OpenApiData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/FieldSchemaController")
public class FieldSchemaController {

    @GetMapping("/fileParam")
    public String fileParam(OpenApiData openApiData){
        return "fileParam";
    }

    @GetMapping("/fileFormData")
    public String fileFormData(@ModelAttribute OpenApiData openApiData){
        return "fileFormData";
    }

    @GetMapping("/fileJsonBody")
    public String fileJsonBody(@RequestBody OpenApiData openApiData){
        return "fileFormData";
    }

    /**
     * @methodType application/x-www-form-urlencoded
     * @param openApiData
     * @return
     */
    @PostMapping("/filewwwUrl")
    public String filewwwUrl(@ParamType("form") OpenApiData openApiData){
        return "fileFormData";
    }

}
