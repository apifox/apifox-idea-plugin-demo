package com.example.springtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericsParam<T> {

    private String nameParam;
    private String ageParam;
    private String positionParam;
    private T dataParam;

}
