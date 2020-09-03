package day08._05;

public class Test {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("王小平",25,"java课");
        System.out.println(teacher.getName()+"老师，"+"讲授"+teacher.getSubject());
        Student student=new Student("王小平",25,90);
        System.out.println(student.getName()+"同学，"+"考试得"+student.getScore());
    }
}
