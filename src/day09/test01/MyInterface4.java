package day09.test01;

/**
 *  interface接口：1.抽象方法
 *                 2.默认方法（被子类调用或者重写）
 *                 3.静态方法
 *                 4.私有方法和静态私有方法（1.9 供静态方法和默认方法调用）
 *                 5.不能有静态代码块
 *                 6.不能有构造器
 *  抽象类：
 *                  1.可以有构造器
 *                  2.可以有静态代码块
 *                  3.不能实例化对象
 * 子类需要重写父接口中的抽象方法。如果不重写，则必须声明成抽象类
 * 接口多实现：
 * 1.类实现的多个接口中，同名抽象方法只需要重写一次
 * 2.如果多个接口中包含同名的默认方法，必须重写一次
 * 3.接口中静态方法同名，不影响程序
 * 4.一个类继承的一个类又实现了多个接口，子类重写了同名的方法，同名方法优先用子类重写的或者父类的
 *              ctrl+shift+u 切换带大小写   ctrl+o 快捷键快速重写方法
 *      注意：1.接口中不能有成员变量，但是可以有常量
 *            2.接口可以多继承：
 *            接口中的方法都是抽象方法，可以省略修饰符public abstract
 *
 *
 */

public class MyInterface4 implements MyInterface2,MyInterface3{


    public static void main(String[] args) {
        new MyInterface4().show();
    }


    @Override
    public void show() {

    }
}
