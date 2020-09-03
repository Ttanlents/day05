package day13.test02;

import java.util.HashSet;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<String> strings =new listUtils<String>().addList("a","f","b","c","a","d");
        HashSet<String> hashSet=new HashSet<>();
        hashSet.addAll(strings);
        strings.clear();
        strings.addAll(hashSet);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
