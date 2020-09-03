package day14.test03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Map<String,String> map=new HashMap<>();
        String[] arr={"苹果","香蕉","西瓜","橘子"};
        Random random=new Random();
        while (true){
            if (set.size()>3){
                break;
            }
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < 8; i++) {
                sb.append(""+random.nextInt(10));
            }
            String id=sb.toString();
            set.add(id);
        }
        int index=0;
        for (String s : set) {
            map.put(s,arr[index++]);
        }

        System.out.println(map);
    }
}
