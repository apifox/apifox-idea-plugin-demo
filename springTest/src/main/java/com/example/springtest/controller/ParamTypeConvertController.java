package com.example.springtest.controller;

import com.example.springtest.anno.ParamTypeConvert;
import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/paramConvertController")
public class ParamTypeConvertController {

    @GetMapping("/paramConvertControllerNoChange")
    public String paramNameControllerNoChange(String id, Integer sex, User user) {
        return "paramNameControllerNoChange";
    }

    @GetMapping("/paramConvertControllerChange")
    public String paramNameControllerChange(@ParamTypeConvert("com.example.springtest.entity.User") String id,
                                            @ParamTypeConvert("com.example.springtest.entity.Case") @RequestBody Integer sex,
                                            @ParamTypeConvert("Integer") String address) {
        return "paramNameControllerChange";
    }

}
