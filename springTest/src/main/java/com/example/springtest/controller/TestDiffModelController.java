package com.example.springtest.controller;

import com.example.springselfdemo.controller.BaseController;
import com.example.springtest.entity.FieldOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @module SpringModule
 */
@RestController
public class TestDiffModelController extends BaseController {

    /**
     * @module moduleSpringAnno
     * @return
     */
    @GetMapping("/testUrl")
    private String testUrl(FieldOrder fieldOrder){
        return "";
    }

}
