package day05._03;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Student student=new Student("韩同学",18,"java面向对象");
        teacher.setAge(30);
        teacher.setContent("java面向对象");
        teacher.setName("周老师");
        teacher.eat();
        teacher.study();
        student.eat();
        student.study();
    }

}
