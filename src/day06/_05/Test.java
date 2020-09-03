package day06._05;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student("it001","黄渤",1.72));
        list.add(new Student("it002","孙红雷",1.78));
        list.add(new Student("it003","章子怡",1.64));
        list.add(new Student("it004","杨颖",1.68));
        System.out.println("集合大小;"+list.size());
        for (Student student:list){
            System.out.println(student.getId()+","+student.getName()+","+student.getTall());

        }
        System.out.println("身高大于1.70;");
        for (Student student:list){
            if (student.getTall()>1.70){
                System.out.println(student.getId()+","+student.getName()+","+student.getTall());

            }
        }

    }
}
