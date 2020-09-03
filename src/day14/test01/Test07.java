package day14.test01;

import java.util.HashMap;
import java.util.Map;

public class Test07 {
    public static void main(String[] args) {
        Student s1=new Student("张三",18);
        Student s2=new Student("李四",18);
        Student s3=new Student("李四",18);
        Student s4=new Student("万物",18);
        Student s5=new Student("李四",18);
        Map<String,Student> map=new HashMap<>();
        map.put("北京",s1);
        map.put("美国",s2);
        System.out.println("keySet遍历：");
        for (String s : map.keySet()) {
            System.out.println(s+"="+map.get(s));
        }
        System.out.println("entrySet遍历：");
        for (Map.Entry<String, Student> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
