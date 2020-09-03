package day08;

/**
 * 在继承关系中，父类 的构造方法访问特点：
 *          1.子类的构造方法会默认隐含赠送一个super();调用父类无惨构造
 *          2.子类构造方法可以访问父类重载构造方法
 *          3.调用父类的构造方法super()必须是在子类构造方法中的第一句
 *          4.如果手动写了super(参数)调用父类的有参构造，super()不会赠送
 *          5.只有子类的构造方法才能调用父类的构造方法
 *     super的用法：
 *          调用父类的成员变量  super.成员变量
 *          调用父类的成员方法   super.成员方法
 *          调用父类的构造方法  super(参数) 必须是构造方法中的第一句话
 *     this的用法
 *          调用本类的成员变量  this.成员变量
 *  *       调用本类的成员方法   this.成员方法
 *  *       调用本类的构造方法  this(参数) 必须是构造方法中的第一句话
 *
 *
 *
 * java中继承的特点：
 *      1.java中是单继承（亲爸爸只有一个）但是可以多级继承
 *      2.一个父类可以被多个子类继承
 */

public class Test01 extends Test02{
    public static void main(String[] args) {

        //父类不能强转为子类
        Student teacher =  new Teacher();
        teacher.sleep();
        teacher.eat();
        teacher.dance();
        System.out.println(teacher.getName());
        System.out.println(teacher.sex);


        Person mystudent=   new MyStudent();
       /* System.out.println(person.name);
        Person person1=new MyTeacher();
        System.out.println(person1.name);*/

        mystudent.eat();
        mystudent.sleep();
        System.out.println( mystudent.name);


        new SamrtPhone().show();

        new Test01().show();
    }
}
