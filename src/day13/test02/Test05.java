package day13.test02;

import java.util.*;

public class Test05 {
    public static void main(String[] args) {
        String arr[] ={"abc","bac","abc","aab","bad","cef","jhi"};
        Set<String> set=new HashSet<>();
        set.addAll(Arrays.asList(arr));
        List<String> list=new ArrayList<>();
        list.addAll(set);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
