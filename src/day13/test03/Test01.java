package day13.test03;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> redList=new ArrayList<>();
        List<Integer> blueList=new ArrayList<>();
        Set<Integer> doubleColor=new HashSet<>();
        for (int i = 1; i < 34; i++) {
            redList.add(i);
        }
        for (int i = 1; i < 17; i++) {
            blueList.add(i);
        }
        Random random=new Random();
       while (true){
           if (doubleColor.size()==6){
               break;
           }
           int temp=random.nextInt(33)+1;
           doubleColor.add(redList.get(temp));
       }
        while (true){
            if (doubleColor.size()==7){
                break;
            }
            int temp=random.nextInt(16)+1;
            doubleColor.add(redList.get(temp));
        }
        System.out.println(doubleColor);
    }
}
