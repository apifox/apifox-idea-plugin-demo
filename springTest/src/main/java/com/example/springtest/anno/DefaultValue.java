package com.example.springtest.anno;

public @interface DefaultValue {

    String value();

    String desc() default "";
}
