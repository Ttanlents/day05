package day13.test02;

import java.util.*;

public class Test06 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (true) {
            if (set.size()>=10){
                break;
            }
            int temp = random.nextInt(20) + 1;
            set.add(temp);
        }
        //增强for循环
        for (Integer integer : set) {
            System.out.println(integer);
        }
        //迭代器
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer integer = it.next();
            System.out.println(integer);
        }

    }
}
