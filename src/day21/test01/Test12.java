package day21.test01;

import java.lang.reflect.Method;

/**
 * @author 余俊锋
 * @date 2020/9/2 19:17
 */
public class Test12 {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<MyBook> myBookClass = MyBook.class;
        Method method = myBookClass.getDeclaredMethod("book");

        System.out.println(method);
        if (method.isAnnotationPresent(Book.class)){
            Book annotation = method.getAnnotation(Book.class);
            System.out.println(annotation.price());
            System.out.println(annotation.value());
            for (String author : annotation.authors()) {
                System.out.println(author);
            }
        }
    }

}
