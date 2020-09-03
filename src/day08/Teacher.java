package day08;

/**
 * 面向对象三大特征： 封装，继承，多态
 *      继承性：（共性抽取）
 *          将多个子类（派生类）相同的属性和行为抽取出来形成一个单独的父类（超类、基类），子类继承父类，可以拥有父类
 *          所有非私有的属性和行为
 *          继承是多态的前提，没有继承就没有多态
 * 定义父类的格式：一个普通类
 *          public class 父类的名称（）
 * 定义子类的格式：
 *          public class 子类的名称 extends 父类的名称{}
 *     注意：并不是所有的父类内容都能够被继承
 *          1.被private修饰的成员变量和方法
 *          2.父类构造器
 *          3.多态中编译看左边，运行看右边（静态看左边，成员看右边）
 *  在继承中，子类访问局部变量、成员变量、父类成员变量的方法是：
 *   1.方法局部：num
 *   2.本类成员变量：this.num
 *   3.父类成员变量：super.num
 *
 *   在继承关系中，成员变量重名时，创建子类访问成员变量：
 *      1.直接访问  子类.成员变量
 *          等号左边是谁谁就优先用谁，没有就向上找父类，父类没有就编译报错
 *       2.间接访问  子类.成员方法
 *          这个方法属于谁就优先谁，没有就向上找父类，父类没有则编译错误
 *   在继承关系中，成员方法重名：
 *      1.谁创建的对象就优先用谁，否则向上找父类的方法
 *   区别：
 *      重载方法，
 *              1.不关注权限修饰符和返回值，只关注方法名和参数列表
 *      重写方法：
 *              1.函数名和参数列表都要一模一样。
 *      Override特点:
 *              1.创建的是子类对象优先用子类，子类没有找父类
 *       注意事项;
 *              1.注解：@Overrider 写在方法上，用于检测是否是正确的覆盖重写方法。
 *              2.不加不报错，但是有可能是重载的方法。
 *              3.子类的返回值必须小于等于父类 的返回值（String Object）
 *              4.子类的方法权限修饰符必须大于父类的权限修饰符(public protect default private)
 *
 */

public class Teacher extends Student {
    String name="名字老师";
    int age;
    static String sex="老师";

    static {
        System.out.println("老师静态块");
    }



    public Teacher(){
        System.out.println("老师构造器");
    }
    public void eat(){
        System.out.println("老师在吃饭");
    }
    public  void sleep(){
        System.out.println("老师在睡觉");
    }

    public static  void dance(){
        System.out.println("老师在跳舞，静态方法");
    }
}
