package day06._04;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("铁扇公主");
        System.out.println(list.get(3));
        System.out.println(list.set(3,"唐僧"));
        System.out.println(list.remove(1));
        for (String name:list){
            System.out.println(name);
        }
    }
}
