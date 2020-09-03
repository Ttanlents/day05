package day09.test02;

/**
 * 多态：Fu fu=new Zi();
 *      1.调用方法时，会先找父类的方法如果没有这个方法就会报编译错误
 *      2.如果父类有，就会执行子类重写的方法
 *      3.如果父类没有，子类有就会要求实例进行类型强制转换（小转大）
 *      4.如果父类有，子类没有，就会调用父类的
 */

public class Test {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        System.out.println(animal instanceof Cat);
        Animal animal2=new Dog();
        animal2.eat();
        System.out.println(-5%3);

    }
}
