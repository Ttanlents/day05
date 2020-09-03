package day21.test01;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 余俊锋
 * @date 2020/9/2 15:31
 */
public class Test08 {
    public static void main(String[] args) throws  Exception {
        Properties ps = new Properties();
        ps.load(new FileInputStream("Module1/src/day21/test01/application.properties"));
       String demoClass =(String) ps.get("class");
        Class<?> aClass = Class.forName(demoClass);
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();
        Method method = aClass.getDeclaredMethod("run");
        method.invoke(o);


    }
}
