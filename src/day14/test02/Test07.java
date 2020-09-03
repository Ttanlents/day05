package day14.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        String message="If you wantto change your fate I think you must come to the dark horse to learn java";
        Scanner scanner=new Scanner(System.in);
        message=scanner.nextLine();
        String[] mes=message.split(" ");
        Map<String,Integer> map=new HashMap<>();
        for (String s : mes) {
            map.put(s,s.length());
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

}
