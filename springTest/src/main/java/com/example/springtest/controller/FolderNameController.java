package com.example.springtest.controller;

import com.example.springtest.anno.Folder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/base")
public class FolderNameController {

    /**
     * testFolderNameDoc
     * @folder 一级目录/二级目录
     */
    @GetMapping("/testFolderNameDoc")
    public String testFolderNameDoc(){
        return "testFolderName";
    }

    /**
     * testFolderNameAnnotation
     */
    @GetMapping("/testFolderNameAnnotation")
    @Folder("一级目录/三级目录")
    public String testFolderNameAnnotation(){
        return "testFolderName";
    }

    @GetMapping("/testFolderName")
    public String testFolderName(){
        return "testFolderName";
    }


}
