package day08;

public class MyTeacher extends Person {
    String name="老师";
    int age=28;

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void sleep() {
        System.out.println(name + "睡觉");
    }
}
