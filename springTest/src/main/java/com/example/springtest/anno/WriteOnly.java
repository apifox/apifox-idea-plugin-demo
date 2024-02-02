package com.example.springtest.anno;

public @interface WriteOnly {

    boolean value() default true;

}
