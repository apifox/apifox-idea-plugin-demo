package org.springframework.validation.annotation;

import java.lang.annotation.*;

/**
 * 返回值分组校验 内置注解 请保持全限定类名一致
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidatedResponse {
    Class<?>[] value() default {};
}
