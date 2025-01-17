package com.example.springtest.controller;

import com.example.springtest.entity.Assembly;
import com.example.springtest.entity.TestHandlerJsonFieldSchema;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/SchemaOneOfAnyOfAllOfController")
public class SchemaOneOfAnyOfAllOfController {

    @PostMapping("/handlerJsonField")
    public Object handlerJsonField(@RequestBody TestHandlerJsonFieldSchema testHandlerJsonFieldSchema) {
        return null;
    }

//    @PostMapping("/handlerJsonField")
//    public Object handlerJsonField(@RequestBody Assembly testHandlerJsonFieldSchema) {
//        return null;
//    }
}
