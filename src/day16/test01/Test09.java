package day16.test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/8/26 18:20
 */
public class Test09 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        HashSet<Object> set = new HashSet<>();
        HashMap<String, String> hashMap = new HashMap<>();
        list.stream().forEach((n)->{
            System.out.println(n);
        });
        set.stream().forEach((n)->{
            System.out.println(n);
        });
        hashMap.entrySet().stream().forEach((n)->{
            System.out.println(n.getKey());
            System.out.println(n.getValue());
        });
    }
}
