package day10.test02;

/**
 * 成员内部类
 *
 */

public class Body {
    public static void main(String[] args) {
        Body body=new Body();
        Body.Heart heart=body.new Heart();
        heart.action();
    }
    String name="张三";

    class Heart{
        String name="李四";

        void action(){
            String name="王五";
            System.out.println(Body.this.name+this.name+name+"心脏在跳动");
        }
    }
}
