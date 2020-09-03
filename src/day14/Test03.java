package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test03 {
   static BufferedReader bf;
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        System.out.println("请输入一个字符串：");
         bf = new BufferedReader(new InputStreamReader(System.in));
        String msg = bf.readLine();
        String[] a=msg.split("");
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
                continue;
            }
            map.put(a[i],1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"出现"+entry.getValue()+"次");
        }
        if (bf!=null){
            bf.close();
        }
    }
}
