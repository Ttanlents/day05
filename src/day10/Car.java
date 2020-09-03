package day10;

/**
 * 成员内部类
 *  示例
 */
public class Car {
    public static void main(String[] args) {
        Car.Engine engine=new Car().new Engine();
        engine.run();
    }
   private String name = "大黄蜂";

    public void run2() {

    }

    //类中方法外
    class Engine {
        String name="小黄蜂";
        public void run(){
            String name="局部小黄蜂";
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Car.this.name);
        }
    }
}


