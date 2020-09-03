package day09.test6;

public class SportStudent extends Student implements Sport{
    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄"+age+"名字"+name+"体育生打篮球");
    }
}
