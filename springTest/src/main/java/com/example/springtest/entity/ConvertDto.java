package com.example.springtest.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConvertDto<T> {

    private String one;
    private String two;
    private T three;

}
