package day09.test6;

public class sportTeacher extends Teacher implements Sport {
    public sportTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄"+age+"名字"+name+"体育老师打篮球");
    }
}
