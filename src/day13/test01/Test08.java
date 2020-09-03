package day13.test01;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test08 {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("王昭君");
        set.add("王昭君");
        set.add("西施");
        set.add("杨玉环");
        set.add("貂蝉");
        for (String s : set) {
            System.out.println(s);
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
             String sr =  it.next();
            System.out.println(sr);

        }

    }
}
