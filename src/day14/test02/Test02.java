package day14.test02;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("柳岩",2100);
        map.put("张亮",1700);
        map.put("诸葛亮",1800);
        map.put("灭绝师太",2600);
        map.put("东方不败",3800);
        int salary=map.get("柳岩");
        System.out.println(salary);
        map.put("柳岩",salary+300);
        for (String s : map.keySet()) {
            System.out.println(s+"-->"+map.get(s));
        }
    }
}
