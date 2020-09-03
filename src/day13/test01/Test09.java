package day13.test01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test09 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(33);
        list.add(11);
        list.add(77);
        list.add(55);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        Collections.reverse(list);
    }
}
