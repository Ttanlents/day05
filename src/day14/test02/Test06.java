package day14.test02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test06 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        list.add("abcd");
        list.add("abcde");
        for (String s : list) {
         char[] a= s.toCharArray();
            for (char c : a) {
                if (map.get(c)!=null){
                    map.put(c,map.get(c)+1);
                    continue;
                }
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
