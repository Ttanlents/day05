package day08;

public class MyStudent extends Person {
    String name="学生";
    int age=13;

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }
}
