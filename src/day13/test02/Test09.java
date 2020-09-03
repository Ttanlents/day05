package day13.test02;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test09 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        List<String> list1=new listUtils<String>().addList("a","b","a","c","d");
        List<String> list2=new listUtils<String>().addList("e","f","a","d","g");
        set.addAll(list1);
        set.addAll(list2);
        System.out.println(set);
    }
}
