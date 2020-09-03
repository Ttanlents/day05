package day14.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       while (true){
           if (map.size()>=5){
               break;
           }
           System.out.println("请输入姓名，年龄 格式：\"姓名，年龄\"");
           String[] msg = bf.readLine().split(",");
           String name=msg[0];
           Integer age=Integer.parseInt(msg[1]);
           map.put(name,age);
       }
        System.out.println(map);

    }
}
