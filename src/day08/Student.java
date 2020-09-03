package day08;

public class Student {
    String name="名字是学生";
    int age;
    static String sex="学生";

    static {
        System.out.println("学生静态块");
    }

    public Student() {
        System.out.println("学生构造器");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("学生在吃饭");
    }
    public  void sleep(){
        System.out.println("学生在睡觉");
    }

    public static  void dance(){
        System.out.println("学生在跳舞，静态方法");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
