package com.example.springtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericsReturn<T> {

    private String nameReturn;
    private String ageReturn;
    private String positionReturn;
    private T dataParamReturn;

}
