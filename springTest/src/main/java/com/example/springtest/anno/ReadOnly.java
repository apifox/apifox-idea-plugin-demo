package com.example.springtest.anno;

public @interface ReadOnly {

    boolean value() default true;

}
