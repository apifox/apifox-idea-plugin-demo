package com.example.springtest.controller;

import com.example.springtest.anno.Testing;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apiStatusController")
public class ApiStatusController {

    /**
     * @obsolete
     */
    @GetMapping("/obsoleteClassDoc")
    public String obsoleteClassDoc(){
        return "obsolete";
    }

    /**
     * @designing
     */
    @GetMapping("/designingClassDoc")
    public String designingClassDoc(){
        return "designing";
    }

    @GetMapping("/testingClassDoc")
    @Testing
    public String testingClassDoc(){
        return "testing";
    }

}
