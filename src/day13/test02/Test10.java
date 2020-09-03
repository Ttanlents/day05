package day13.test02;

import java.util.Iterator;
import java.util.Set;

public class Test10 {
    public static void main(String[] args) {

        Student2 s1=new Student2("张三",18,95);
        Student2 s2=new Student2("李四",18,85);
        Student2 s3=new Student2("王五",18,95);
        Student2 s4=new Student2("李七",18,65);
        Student2 s5=new Student2("王八",18,78);

        Set<Student2> studentSet=new listUtils<Student2>().addSet(s1,s2,s3,s4,s5);
        Iterator<Student2> it = studentSet.iterator();
        int maxScore=s1.getScore();
        int minScore=s2.getScore();
        int avg=0;
        int sum=0;
        while (it.hasNext()) {
            Student2 student2 = it.next();
            int temp=student2.getScore();
            if (temp>maxScore){
                maxScore=temp;
            }
            if (temp<minScore){
                minScore=temp;
            }
            sum+=temp;

        }
        avg=sum/studentSet.size();
        System.out.println("总分:"+sum+"平均分："+avg+"最高分"+maxScore+"最低分"+minScore);
    }
}
