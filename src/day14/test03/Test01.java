package day14.test03;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, Map<String,String>> map = new HashMap<>();
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("001","李晨");
        map1.put("002","范冰冰");
        map.put("java基础班",map1);
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("001","马云");
        map2.put("003","马化腾");
        map.put("java就业班",map2);
        System.out.println(map);
    }
}
