package com.example.springtest.entity;

import com.example.springtest.anno.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassDataAll {


    private ClassNotNullData classNotNullData;

    @Null
    private ClassNullData classNullData;

    @Null
    private String testClassDataAll;

}
