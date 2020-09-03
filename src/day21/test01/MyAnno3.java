package day21.test01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 余俊锋
 * @date 2020/9/2 18:03
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface MyAnno3 {
    String type();
    int[] intArr();

}
