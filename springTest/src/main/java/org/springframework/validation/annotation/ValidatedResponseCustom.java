package org.springframework.validation.annotation;

import java.lang.annotation.*;

/**
 * 自定义返回值分组校验
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidatedResponseCustom {
    Class<?>[] value() default {};
}
