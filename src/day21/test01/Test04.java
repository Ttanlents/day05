package day21.test01;

import java.lang.reflect.Constructor;

/**
 * @author 余俊锋
 * @date 2020/9/2 15:02
 */
public class Test04 {
    public static void main(String[] args) throws Exception {
        Class<Show> showClass = Show.class;
        Constructor<Show> constructor = showClass.getDeclaredConstructor();
        Show show = constructor.newInstance();
        show.show();
    }
}
