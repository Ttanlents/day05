package day21.test01;

import java.lang.reflect.Field;

/**
 * @author 余俊锋
 * @date 2020/9/2 15:16
 */
public class Test06 {


    public void setProperty(Object obj, String propertyName, Object value) {
        Class<?> objClass = obj.getClass();
        try {
            Field field = objClass.getDeclaredField(propertyName);
            field.setAccessible(true);
            field.set(obj, value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Object getProperty(Object obj, String propertyName) throws Exception {
        Class<?> objClass = obj.getClass();
        Field field = objClass.getDeclaredField(propertyName);
        field.setAccessible(true);
        return field.get(propertyName);
    }
}
