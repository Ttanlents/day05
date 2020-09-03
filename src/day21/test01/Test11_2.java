package day21.test01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 余俊锋
 * @date 2020/9/2 18:46
 */
public class Test11_2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Test11> test11Class = Test11.class;
        Test11 test11 = test11Class.newInstance();
        Method[] methods = test11Class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(test11);
            }
        }
    }
}
