package day09.test01;

//子类实现父类
public interface Fu {
   /*public  Fu(){

    }*/
    public abstract   void eat();

    default void sleep(){
        System.out.println("父类睡觉");
    }

    default void dance(){
        System.out.println("父类跳舞");
    }

    public static void staticMethod(){
        System.out.println("父类静态方法");
        System.out.println("父类静态方法");
    }
}
