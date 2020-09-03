package day10.test01;

public class Test {
    public static void main(String[] args) {
        swim(new Student());
        swim(new Swim() {
            @Override
            public void swimming() {
                System.out.println("自由泳");
            }
        });
        swim(new Swim() {
            @Override
            public void swimming() {
                System.out.println("仰泳！！！");
            }
        });
    }


    public static void swim(Swim swim) {
        swim.swimming();
    }
}
