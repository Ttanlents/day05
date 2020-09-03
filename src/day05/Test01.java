package day05;

public class Test01 {
    public static void main(String[] args) {
        Friend friend=new Friend();
        friend.age=18;
        friend.gender="女";
        friend.name="小红";
        //这是一个成员对象
        System.out.println(friend);
        //这是一个成员方法
        friend.action();

        Start start=new Start();
        start.stageName="周杰伦";
        start.works="稻香";
        start.gender="男";

        Student student=new Student();
        student.age=20;
        student.gender="男";
        student.StudentName="小明";

        Teacher teacher=new Teacher();
        teacher.subject="语文";
        teacher.clazz="10班";
        teacher.name="黄晓";
        teacher.teacher();
        teacher.work();

        Dog dog1=new Dog();
        Dog dog2=new Dog("牧羊犬",5,"黄色");
        Dog dog3=new Dog("藏獒",6,"白色");
        dog1.setAge(7);
        dog1.setColor("紫色");
        dog1.setName("猫");
        dog3.tail();
        dog1.tail();
    }
}
