package day09.test6;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("学生吃饭");
    }
}
