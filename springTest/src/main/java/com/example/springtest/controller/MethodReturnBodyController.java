package com.example.springtest.controller;

import com.example.springtest.anno.ReturnType;
import com.example.springtest.entity.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/methodReturnBodyController")
public class MethodReturnBodyController {


    @GetMapping("/methodReturnNoChange")
    public User methodReturnNoChange(){
        return null;
    }

    @GetMapping("/methodReturnNoChangeBody")
    @ResponseBody
    public User methodReturnNoChangeBody(){
        return null;
    }

    /**
     * @returnType application/xml
     */
    @GetMapping("/methodReturnDoc")
    public User methodReturnDoc(){
        return null;
    }

    @ReturnType("text/event-stream")
    @GetMapping("/methodReturnAnno")
    public User methodReturnAnno(){
        return null;
    }

    @GetMapping(value = "/methodReturnXml",produces = MediaType.APPLICATION_XML_VALUE)
    public User methodReturnXml(){
        return null;
    }

    @GetMapping(value = "/methodReturnStream",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public User methodReturnStream(){
        return null;
    }

    @ReturnType("application/octet-stream")
    @GetMapping("/methodReturnAnnoBinary")
    public User methodReturnAnnoBinary(){
        return null;
    }

    @ReturnType("text/plain")
    @GetMapping("/methodReturnAnnoRow")
    public Void methodReturnAnnoRow(){
        return null;
    }

}
