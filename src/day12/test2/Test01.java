package day12.test2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三",15,95));
        students.add(new Student("李四",15,85));
        students.add(new Student("王五",15,75));
        students.add(new Student("张三",15,65));
        Iterator<Student> it = students.iterator();
        int total=0;


        int avg=0;
        int minScore=students.get(0).getScores();
        int maxScore=students.get(0).getScores();

        while (it.hasNext()) {
            Student student = it.next();
            System.out.println(student);
            int temp=student.getScores();
            total+=temp;
            if (temp>maxScore){
                System.out.println(temp);
                maxScore=temp;
            }
            if (temp<minScore){
                minScore=temp;
            }
        }
        avg=total/students.size();
        System.out.println("分数总和："+total+"最低分："+minScore+"最高分"+maxScore+"平均分："+avg);
    }
}
