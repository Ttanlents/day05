package day08;

public class Person {
    //抽取共性 用于被继承
    String name="人";
    int age=100;

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }
}
