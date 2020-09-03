package day14.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String messgae = scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        char[] keys = messgae.toCharArray();
        for (char key : keys) {
            if (key>='a'&&key<='z'||key>='A'&&key<='Z'){
                countionKey(map,"字母");
                continue;
            }
            if (key>='0'&&key<='9'){
                countionKey(map,"数字");
                continue;
            }
            if (key==' '){
             countionKey(map,"空格");
             continue;
            }
            countionKey(map,"其他");
        }

        System.out.println(map);
    }

    public static Map<String, Integer> countionKey(Map<String, Integer> map, String key) {
        if (map.get(key) == null) {
            map.put(key, 1);
            return map;
        }
        map.put(key, map.get(key) + 1);
        return map;
    }
}
