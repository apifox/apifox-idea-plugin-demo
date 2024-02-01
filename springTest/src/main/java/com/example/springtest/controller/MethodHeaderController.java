package com.example.springtest.controller;

import com.example.springtest.anno.Header;
import com.example.springtest.entity.Case;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/methodHeaderController")
public class MethodHeaderController {

    @GetMapping("/methodHeader")
    public String methodHeader(){
        return null;
    }

    /**
     * @header
     * @return
     */
    @GetMapping("/methodHeaderDoc")
    public String methodHeaderDoc(){
        return null;
    }

    @Header
    @GetMapping("/methodHeaderAnno")
    public String methodHeaderAnno(){
        return null;
    }

}
