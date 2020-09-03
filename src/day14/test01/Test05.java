package day14.test01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test05 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","杨颖");
        map.put("谢霆锋","张柏芝");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}
