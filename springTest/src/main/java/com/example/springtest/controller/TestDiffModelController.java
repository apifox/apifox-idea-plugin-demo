package com.example.springtest.controller;

import com.example.springselfdemo.controller.BaseController;
import com.example.springtest.entity.FieldOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @module SpringModule
 */
public class TestDiffModelController extends BaseController {

    /**
     * @return
     * @module moduleSpringAnno
     */
    @GetMapping("/testUrlFieldOrder")
    private String testUrlFieldOrder(FieldOrder fieldOrder) {
        return "";
    }

}
