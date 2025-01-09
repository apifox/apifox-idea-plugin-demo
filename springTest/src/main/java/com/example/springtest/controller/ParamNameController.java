package com.example.springtest.controller;

import com.example.springtest.anno.ParamName;
import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/paramNameController")
public class ParamNameController {

    @GetMapping("/paramNameControllerNoChange")
    public String paramNameControllerNoChange(String id, String sex, User user){
        return "paramNameControllerNoChange";
    }

    /**
     * 对对象无效
      * @param id
     * @param sex
     * @param user
     * @param userBody
     * @return
     */
    @GetMapping("/paramNameControllerChange")
    public String paramNameControllerChange(@ParamName("idName") String id, String sex, @ParamName("UserName") User user, @ParamName("UserNameBody") @RequestBody User userBody){
        return "paramNameControllerChange";
    }

}
