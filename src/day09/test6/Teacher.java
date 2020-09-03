package day09.test6;

public class Teacher extends Person {


    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("老师再吃工作餐");
    }
}
