package com.example.springtest.controller;

import com.example.springtest.anno.DefaultValue;
import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/paramDefaultController")
public class ParamDefaultController {

    /**
     *
     * @param id
     * @return 返回值描述
     */
    @GetMapping({"/paramDefault"})
    public User paramDefault(@DefaultValue("默认数据") String id){
        return null;
    }

    @GetMapping({"/paramDefaultUser"})
    public User paramDefaultUser(@DefaultValue("默认数据") User user){
        return null;
    }

    /**
     * @param id 描述ID 拼接
     * @return 返回值描述是个用户
     */
    @GetMapping({"/paramDefaultDesc"})
    public User paramDefaultDesc(@DefaultValue(value = "默认数据Desc",desc = "描述ID") String id){
        return null;
    }

    @GetMapping({"/paramDefaultUserDesc"})
    public User paramDefaultUserDesc(@DefaultValue(value = "默认数据Desc",desc = "描述User") User user){
        return null;
    }

}
