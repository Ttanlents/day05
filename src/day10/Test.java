package day10;

/**
 * final 关键字：
 *      final修饰的类不能被继承
 *      final修饰的方法 不能被重写
 *      final修饰的常量不能被重新赋值  （只能赋值一次）
 * 权限修饰符：
 *      private 私有的 只能在本类中使用
 *      default(默认的friendly) 可以再同一包下使用
 *      protect(受保护的)可以再不同包的子类下使用
 *      public 可以再全部不同包下任意类下使用
 *
 *     成员内部类：
 *          1.Body.Heart heart=new Body().new Heart();
 *          2.内部类中方法调用变量方式：
 *          Body.this.num
 *          this.num
 *          num
 *      局部内部类：
 *          1.内部类中方法调用变量方式
 *              直接调用,包括私有成员变量
 *           2.注意局部内部类不能够在方法之外进行实例化
 *      局部匿名内部内：
 *              1.new 接口+ 重写接口的抽象方法
 *  Lambda 表达式：1.有参(a,b)->{}
 *                  2.无参数（）->{}
 *                   3.有参+返回值(a,b)->{return a+b;}
 */

public class Test extends  Student  {
    private int num=10;

    public void getNum(){
        System.out.println(Test.this.num);
    }


    public static void main(String[] args) {
        System.out.println(new Student().name);

        System.out.println(new Student().age);
        //私有的
        // System.out.println(new Student().house);
    }

    public void getAttr(){
        System.out.println(car);
        System.out.println(new Student().car);
    }
}
