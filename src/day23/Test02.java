package day23;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 余俊锋
 * @date 2020/9/3 15:33
 */
public class Test02 {
    public static void main(String[] args) {
        String name="abcdesldfsldflsadlsf";
        char[] a=name.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char c : a) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
                continue;
            }
            map.put(c,1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("字符："+entry+",数量："+entry.getValue());
        }
    }
}
