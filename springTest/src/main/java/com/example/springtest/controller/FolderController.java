package com.example.springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 目录1/目录2
 */
@RestController
@RequestMapping(value = "/base")
public class FolderController {

    /**
     * @return
     */
    @GetMapping("/testbaseFolderNameDoc")
    public String testFolderNameDoc(){
        return "testFolderName";
    }

    @GetMapping("/testbaseFolderNameDoc")
    public String testFolderNameAnnotation(){
        return "testFolderName";
    }

    @GetMapping("/testbaseFolderName")
    public String testFolderName(){
        return "testFolderName";
    }


}
