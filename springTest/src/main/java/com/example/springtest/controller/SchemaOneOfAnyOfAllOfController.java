package com.example.springtest.controller;

import com.example.springtest.entity.TestHandlerJsonFieldSchema;
import com.example.springtest.entity.assembly.Assembly;
import com.example.springtest.entity.assembly.AssemblyOne;
import com.example.springtest.entity.assembly.AssemblyTwo;
import io.swagger.v3.oas.annotations.media.Schema;
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

    @PostMapping("/TestHandlerJsonFieldSchema")
    public TestHandlerJsonFieldSchema handlerJsonFieldResponse() {
        return null;
    }

    @PostMapping("/handlerJsonParam")
    public Object handlerJsonParam(@RequestBody @Schema(oneOf = {AssemblyOne.class, AssemblyTwo.class}) Assembly assembly) {
        return null;
    }

    @PostMapping("/handlerJsonParamResponse")
    public Assembly handlerJsonParamResponse() {
        return null;
    }
}
