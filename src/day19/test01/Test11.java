package day19.test01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author 余俊锋
 * @date 2020/8/29 12:50
 */
public class Test11 {
    public static void main(String[] args) {
        Student student=new Student("jack",18,"男");
        Student student2= (Student)student.clone();
        Student student3= (Student)student.clone();
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("Module1/a.txt"));
            for (Student student1 : students) {
                oos.writeObject(student1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
