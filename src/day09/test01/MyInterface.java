package day09.test01;

/**
 * interface接口：1.抽象方法
 *                2.默认方法
 *                3.静态方法
 *                4.私有方法和静态私有方法（1.9 供静态方法和默认方法调用）
 *                5.不能有静态代码块
 */

public interface MyInterface {
    public static final  String NAME="马云";
    String HELLOW_WORLD="你好世界";

    //1.默认方法   用于被子类继承或重写（可以调用私有方法）
    public default void method(){
        System.out.println("工资类调用");
    }

    //2.静态方法 可以调用私有静态方法
    public static void method2(){

        System.out.println("供本类调用");
    }

    //3.抽象方法
    public void method3();

    //4.私有方法1.9版本可以有
    default  void method4(){

    }

    //5.接口中不能有静态块
  /* static {

    }*/
}
