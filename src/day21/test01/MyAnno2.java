package day21.test01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 余俊锋
 * @date 2020/9/2 17:34
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface MyAnno2 {
    String type() default "java";
}
