package day06._06;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Teacher t1=new Teacher("小明",23,"打篮球");
        Teacher t2=new Teacher("锦天",23,"打羽毛球");
        Teacher t3=new Teacher("薛之谦",45,"打篮球");
        List<Teacher> list=new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        for (Teacher teacher:list){
            System.out.println(teacher);
            if (teacher.getAge()>40){
                teacher.setLike("打高尔夫球");
                System.out.println(teacher.show());
            }
        }


    }
}
