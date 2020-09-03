package day21.test01;

import java.lang.reflect.Constructor;

/**
 * @author 余俊锋
 * @date 2020/9/2 14:56
 */
public class Test03 {
    public static void main(String[] args) throws Exception {
        Class<Student> studentClass = Student.class;
        Student student=studentClass.newInstance();
        System.out.println(student);

        Constructor<Student> constructor = studentClass.getDeclaredConstructor(String.class, Integer.class, String.class);
        Student student1 = constructor.newInstance("张三", 18, "男");
        System.out.println(student1);
    }
}
