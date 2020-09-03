package day14.test01;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("张三","123456");
        map.put("李四","1234567");
        map.put("王五","1234568");
        map.put(null,null);
        map.get("张三");
        map.remove("张三");
        System.out.println(map);
    }
}
