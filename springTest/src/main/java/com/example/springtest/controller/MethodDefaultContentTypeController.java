package com.example.springtest.controller;

import com.example.springtest.anno.ParamType;
import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/methodDefaultContentTypeController")
public class MethodDefaultContentTypeController {


    /**
     * @methodType multipart/form-data
     * Get请求默认是query 规则无法生效
     */
    @GetMapping("/formDataClassDocGet")
    public String formDataClassDocGet(@ParamType("form") User data
    ){
        return "originalClass";
    }

    /**
     * @methodType multipart/form-data
     * @desc 规则之间需要搭配使用  @methodType 与 @ParamType 需要搭配使用才行
     */
    @PostMapping("/formDataClassDocPost")
    public String formDataClassDocPost(@ParamType("form") User data
    ){
        return "originalClass";
    }

    /**
     * @methodType application/json
     * @desc  规则之间需要搭配使用  @methodType 与 @ParamType 需要搭配使用才行
     */
    @PostMapping("/formDataClassDocPostJson")
    public String formDataClassDocPostJson(@ParamType("body") User data
    ){
        return "originalClass";
    }


    /**
     * 这个规则 是可以单独使用的 ParamType
     */
    @PostMapping("/paramTypeForm")
    public String paramTypeForm(@ParamType("form") User data
    ){
        return "originalClass";
    }

    /**
     * 这个规则 是可以单独使用的 ParamType
     */
    @PostMapping("/paramTypeBody")
    public String paramTypeBody(@ParamType("body") User data
    ){
        return "originalClass";
    }

    @PostMapping("/paramTypeQuery")
    public String paramTypeQuery(@ParamType("query") User data
    ){
        return "originalClass";
    }


}
