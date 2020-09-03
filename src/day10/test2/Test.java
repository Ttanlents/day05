package day10.test2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("小红","上课"));
        list.add(new Student("小亮","上课"));
        list.add(new Student("小明","旷课"));

        new Clazz("java",new Teacher("张老师"),list).show();

    }
}
