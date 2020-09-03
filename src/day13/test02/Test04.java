package day13.test02;

import java.util.Iterator;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 15, "男");
        Student s2 = new Student("李四", 15, "男");
        Student s3 = new Student("王五", 15, "男");
        Student s4 = new Student("赵六", 15, "男");
        Student s5 = new Student("李七", 15, "男");
        Student s6 = new Student("王八", 15, "男");
        Student s7 = new Student("赵九", 15, "男");
        Student s8 = new Student("钱十", 15, "男");
        Student s9 = new Student("张三", 15, "男");
        Set<Student> students = new listUtils<Student>().addSet(s1, s2, s3, s4, s5, s6, s7, s8, s9);
        Iterator<Student> it = students.iterator();
        System.out.println("总人数："+students.size());
        while (it.hasNext()) {
            Student student = it.next();
            System.out.println(student);
        }
        System.out.println();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
