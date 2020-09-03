package day13.test01;

import java.util.HashSet;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵六");
        set.stream().forEach(n->{
            System.out.println(n);
        });
    }
}
