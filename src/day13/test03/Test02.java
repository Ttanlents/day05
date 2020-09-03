package day13.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
    public static void main(String[] args) {
        HashSet<Student> clazzes = new HashSet<>();
        Student s1 = new Student("张三", 15);
        Student s2 = new Student("李四", 13);
        clazzes.add(s1);
        clazzes.add(s2);
        HashSet<Set<Student>> subjects = new HashSet<>();
        subjects.add(clazzes);
        //迭代器
        Iterator<Set<Student>> it = subjects.iterator();
        while (it.hasNext()) {
            Set<Student> students = it.next();
            Iterator<Student> it2 = students.iterator();
            while (it2.hasNext()) {
                Student student = it2.next();
                System.out.println(student);
            }
        }
        //增强for
        for (Set<Student> students : subjects) {
            for (Student student : students) {
                System.out.println(student);
            }
        }

    }
}
