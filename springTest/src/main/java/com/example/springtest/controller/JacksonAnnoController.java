package com.example.springtest.controller;

import com.example.springtest.entity.Create;
import com.example.springtest.entity.Delete;
import com.example.springtest.entity.JsonViewEntity;
import com.example.springtest.entity.Update;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/JacksonAnnoController")
public class JacksonAnnoController {

    /**
     * 处理请求
     */
    @GetMapping("/testJsonViewRequest")
    public String testJsonViewRequest(@JsonView JsonViewEntity jsonViewEntity) {
        return "JacksonAnno";
    }

    /**
     * 处理请求
     */
    @GetMapping("/testJsonViewRequestCreate")
    public String testJsonViewRequestCreate(@JsonView(Create.class) JsonViewEntity jsonViewEntity) {
        return "JacksonAnno";
    }

    /**
     * 处理请求
     */
    @GetMapping("/testJsonViewRequestUpdate")
    public String testJsonViewRequestUpdate(@JsonView(Update.class) JsonViewEntity jsonViewEntity) {
        return "JacksonAnno";
    }


    /**
     * 处理请求
     */
    @GetMapping("/testJsonViewRequestDelete")
    public String testJsonViewRequestDelete(@JsonView(Delete.class) JsonViewEntity jsonViewEntity) {
        return "JacksonAnno";
    }

    /**
     * 处理请求
     */
    @GetMapping("/testJsonViewRequestUpdateOrCreate")
    public String testJsonViewRequestUpdateOrCreate(@JsonView({Update.class, Create.class}) JsonViewEntity jsonViewEntity) {
        return "JacksonAnno";
    }



    /**
     * 处理响应
     */
    @GetMapping("/testJsonViewResponse")
    @JsonView
    public JsonViewEntity testJsonViewResponse() {
        return null;
    }

    /**
     * 处理响应
     */
    @GetMapping("/testJsonViewResponseCreate")
    @JsonView(Create.class)
    public JsonViewEntity testJsonViewResponseCreate() {
        return null;
    }

    /**
     * 处理响应
     */
    @GetMapping("/testJsonViewResponseUpdate")
    @JsonView(Update.class)
    public JsonViewEntity testJsonViewResponseUpdate() {
        return null;
    }


    /**
     * 处理响应
     */
    @GetMapping("/testJsonViewResponseDelete")
    @JsonView(Delete.class)
    public JsonViewEntity testJsonViewResponseDelete() {
        return null;
    }

    /**
     * 处理响应
     */
    @GetMapping("/testJsonViewResponseUpdateOrCreate")
    @JsonView({Update.class, Create.class})
    public JsonViewEntity testJsonViewResponseUpdateOrCreate() {
        return null;
    }


}
