package day06;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {
        Student student1=new Student("张三",15,"男");
        Student student2=new Student("李四",16,"男");
        Student student3=new Student("王五",17,"男");

        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //比较大小
        Student sd=list.get(0);
        for (Student student:list){
           // System.out.println(student);
            if (student.getAge()>sd.getAge()){
                sd=student;
            }
        }
        System.out.println(sd);
        sd.setName("小魔女");
        System.out.println(sd);
    }
}
