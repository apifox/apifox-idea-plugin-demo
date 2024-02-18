package com.example.springtest.entity;

import com.example.springtest.anno.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassDataAll {

    private ClassNotNullData classNotNullData;
    private ClassNullData classNullData;

    @NotNull
    private String testClassDataAll;

}
