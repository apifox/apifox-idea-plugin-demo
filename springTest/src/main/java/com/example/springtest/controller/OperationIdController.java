package com.example.springtest.controller;

import com.example.springtest.entity.Case;
import com.example.springtest.entity.FieldDefaultDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 相同的URL
 * 如果想要开启operationId的功能 需要在Apifox目录-> 目录设置-> 目录下的接口唯一标识 -> OperationId
 * @operationId 可以自定义注释 在.apifox-helper.properties文件夹下面的 -> api.operationId 进行配置
 */
@RestController
@RequestMapping(value = "/operationIdController")
public class OperationIdController {

    /**
     * @operationId 1
     * @param fieldDefaultDto
     * @return
     */
    @PostMapping("/operationId")
    public String operationId(FieldDefaultDto fieldDefaultDto){
        return "operationId";
    }

    /**
     * @operationId 2
     * @param entity
     * @return
     */
    @PostMapping("/operationId")
    public String operationId(Case entity){
        return "operationId";
    }

}
