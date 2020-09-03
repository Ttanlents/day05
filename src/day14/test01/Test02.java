package day14.test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"tom");
        map.put(2,"tom");
        map.put(3,"tom");
        map.put(4,"tom");
        for (Integer integer : map.keySet()) {
            System.out.println( map.get(integer));
        }
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry);
        }
    }
}
