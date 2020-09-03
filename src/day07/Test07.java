package day07;

/**
 * static 关键字：静态
 * 可以修饰成员变量和成员方法，一旦用static修饰后的成员变量和成员方法就只属于类
 * static修饰的成员变量叫做静态变量。
 * static修饰的成员方法叫做静态方法。
 * 访问静态变量和静态方法格式：
 * 对象名.静态变量/静态方法 不推荐  jvm本质还是用类名调
 * 类名.静态变量/静态方法
 * 特点：
 * 1.静态不可以访问非静态
 * 2.静态中不能使用this this代表对象（谁调用代表谁） 静态优先于所有对象
 * 静态代码块：
 * static{
 * <p>
 * }
 * 特点：
 * 1.类里面，但是在方法之外
 * 2.优先于构造器
 * 3.类初始化时只执行一次
 * <p>
 * new 一个子类对象是，类加载顺序。
 * 1.父类静态代码块
 * 2.子类静态
 * 3.父类构造器
 * 4.子类构造器
 */

public class Test07 extends Student {
    public Test07() {
        super("tom", 16);
        System.out.println("test07无参构造器");
    }

    static {
        System.out.println("test07静态代码块");
    }

    public static void main(String[] args) {
       /* Student student=new Student("tom",12);
        System.out.println(student);
        Student student2=new Student("tom",12);
        System.out.println(student2);*/
        Student student = new Test07();
        System.out.println(student);
    }

}
