package day14.test02;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        System.out.println(map);
        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");
        System.out.println(map);

    }
}
