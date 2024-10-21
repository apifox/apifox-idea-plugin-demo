package com.example.springtest.entity;

import java.io.Serializable;

public interface BaseEnum<T extends Serializable> {

    /**
     * 枚举描述
     */
    String getDesc();
}

