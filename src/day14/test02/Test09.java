package day14.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        while (true){
            if (map.size()>=5){
                    break;
            }
            String msg=scanner.next();
            String[] msgs=msg.split(",");
            if (msgs.length>=2){
               map.put(msgs[0],Double.parseDouble(msgs[1]));
            }

        }
        /*map.put("java", 32.5);
        map.put("c++", 25.0);
        map.put("php", 28.6);
        map.put("ui", 21.3);
        map.put("python", 10.2);*/
        map.remove("c++");
        map.put("java",map.get("java")+38.5);
        for (String key : map.keySet()) {
            System.out.println(key+"=="+map.get(key));
        }
        System.out.println("entry:");
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println( entry.getKey()+"=="+entry.getValue());
        }

    }
}
