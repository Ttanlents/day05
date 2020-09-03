package day14.test02;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int sumScore=0;
        int maxScore=0;
        int minScore=0;
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();
        while (true) {
            if (map.size() >= 5) {
                break;
            }
            String name = scanner.nextLine();
            map.put(name,random.nextInt(101));

            if (maxScore==0&&minScore==0&&map.size()!=0){
                maxScore=map.get(name);
                minScore=map.get(name);
            }
        }

        int avg=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sumScore+=entry.getValue();
            int temp=entry.getValue();
            if (temp>maxScore){
                maxScore=temp;
            }
            if (temp<minScore){
                minScore=temp;
            }
        }
        avg=sumScore/map.size();
        System.out.println(map);
        System.out.println("总分"+sumScore+"最高分："+maxScore+"最低分"+minScore+"平均分："+avg);
    }
}
