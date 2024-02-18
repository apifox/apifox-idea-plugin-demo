package com.example.springtest.controller;

import com.example.springtest.anno.ApiName;
import com.example.springtest.entity.FileType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fileTypeController")
public class FileTypeController {

    /**
     * fileType只能在json生效
     * @param fileType
     * @return
     */
    @GetMapping("/fileTypeJson")
    public String fileTypeJson(@RequestBody FileType fileType){
        return "fileTypeJson";
    }

    @GetMapping("/fileTypeNoJson")
    public String fileTypeNoJson(FileType fileType){
        return "fileTypeNoJson";
    }

}
