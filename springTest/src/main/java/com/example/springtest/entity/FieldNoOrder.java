package com.example.springtest.entity;


import com.example.springtest.anno.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FieldNoOrder {

    @Order(20)
    private String one;

    @Order(10)
    private String two;

    @Order(15)
    private String three;

    @Order(14)
    private String four;

    private String five;

}
