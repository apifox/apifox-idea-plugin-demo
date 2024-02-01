package com.example.springtest.controller;


import com.example.springtest.anno.Response;
import com.example.springtest.entity.R;
import com.example.springtest.entity.RMain;
import com.example.springtest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/methodReturnController")
public class MethodReturnController {

    @GetMapping("/methodReturnNoChange")
    public User methodReturnNoChange(){
        return null;
    }

    @GetMapping("/methodReturnNoChangeR")
    public R<User> methodReturnNoChangeR(){
        return null;
    }


    /**
     * @response  com.example.springtest.entity.R<com.example.springtest.entity.User>
     */
    @GetMapping("/methodReturnChangeDoc")
    public User methodReturnChangeDoc(){
        return null;
    }

    @Response("com.example.springtest.entity.R<com.example.springtest.entity.User>")
    @GetMapping("/methodReturnChangeAnno")
    public User methodReturnChangeAnno(){
        return null;
    }

    /**
     * @responseLink  {@link R<User>}
     */
    @GetMapping("/methodReturnChangeDocLink")
    public User methodReturnChangeDocLink(){
        return null;
    }


//    /**
//     * @return {@link User}
//     */
//    @GetMapping("/methodReturnMainChangeDoc")
//    public RMain<Integer> methodReturnMainChangeDoc(){
//        return null;
//    }


}
