package day14.test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"tom");
        map.put(2,"tom");
        map.put(3,"tom");
        map.put(4,"tom");
        for (String value : map.values()) {
            System.out.println(value);
        }
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getValue());
        }
    }
}
