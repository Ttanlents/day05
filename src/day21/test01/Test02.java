package day21.test01;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author 余俊锋
 * @date 2020/9/2 14:41
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        Class<? extends ArrayList> listClass = list.getClass();
        Field field = listClass.getDeclaredField("elementData");
        System.out.println(field);
        field.setAccessible(true);
        Object[] objects=(Object[])field.get(list);
        objects[0]="放进去";
        System.out.println(list);
    }
}
