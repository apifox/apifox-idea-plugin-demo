package javax.validation.constraints;

import java.lang.annotation.*;

/**
 * 请一定要全限定类名一致 包名类名完全一致
 * jakarta.validation.constraints.FieldIgnore 或者
 * javax.validation.constraints.FieldIgnore
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldIgnore {

    String message() default "{javax.validation.constraints.FieldIgnore.message}";

    Class<?>[] groups() default {};

}
