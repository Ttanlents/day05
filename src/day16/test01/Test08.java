package day16.test01;

import java.util.Arrays;

/**
 * @author 余俊锋
 * @date 2020/8/26 18:07
 */
public class Test08 {
    public static void main(String[] args) {
        Student student=new Student("",99);
        Student student2=new Student("",60);
        Student student3=new Student("",100);
        Student student4=new Student("",30);
        Student[] students=new Student[]{student,student2,student3,student4};

        Arrays.sort(students,(a,b)->{
            return b.getScore()-a.getScore();
        });
        System.out.println(Arrays.toString(students));

    }
}
