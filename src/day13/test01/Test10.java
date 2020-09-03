package day13.test01;

import java.util.ArrayList;
import java.util.Collections;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> list = add("a", "b", "c");
        for (String s : list) {
            System.out.println(s);
        }

    }

    public static ArrayList<String> add(String... str) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, str);
        return strings;
    }
}
