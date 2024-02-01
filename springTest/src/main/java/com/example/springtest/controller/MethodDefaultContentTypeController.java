//package com.example.springtest.controller;
//
//
//import com.example.springtest.anno.MethodContentType;
//import com.example.springtest.entity.User;
//import org.springframework.web.bind.annotation.*;
//规则有问题
//@RestController
//@RequestMapping(value = "/methodDefaultContentTypeController")
//public class MethodDefaultContentTypeController {
//
//
//    @GetMapping("/originalClass")
//    public String originalClass(User data){
//        return "originalClass";
//    }
//
//    /**
//     * @formData multipart/form-data
//     */
//    @GetMapping("/formDataClassDoc")
//    public String formDataClassDoc(User data){
//        return "originalClass";
//    }
//
//    @MethodContentType("multipart/form-data")
//    @GetMapping("/formDataClassAnno")
//    public String formDataClassAnno(User data){
//        return "formDataClassAnno";
//    }
//
//    @MethodContentType("application/json")
//    @GetMapping("/jsonClassAnno")
//    public String jsonClassAnno(User data){
//        return "formDataClassAnno";
//    }
//
//    @MethodContentType("application/json")
//    @PostMapping("/postJsonClassAnno")
//    public String postJsonClassAnno(User data){
//        return "formDataClassAnno";
//    }
//
//
//
//}
