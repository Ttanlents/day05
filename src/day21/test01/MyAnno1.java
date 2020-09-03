package day21.test01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 余俊锋
 * @date 2020/9/2 17:30
 */


@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface MyAnno1 {
}
