package com.example.springtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 目录1/目录2
 */
@RestController
@RequestMapping(value = "/folderController")
public class FolderController {

    /**
     * @return
     */
    @GetMapping("/testFolderNameDoc")
    public String testFolderNameDoc(){
        return "testFolderName";
    }

    @GetMapping("/testFolderNameAnnotation")
    public String testFolderNameAnnotation(){
        return "testFolderName";
    }

    @GetMapping("/testFolderName")
    public String testFolderName(){
        return "testFolderName";
    }


}
