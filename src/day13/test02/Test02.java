package day13.test02;

import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        Set<String> set = new listUtils<String>().addSet("张三", "李四", "王五", "二丫", "钱六", "孙七");
        set.remove("二丫");
        set.add("王小丫");
        set.stream().forEach(System.out::println);
    }
}
