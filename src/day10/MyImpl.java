package day10;

public class MyImpl {
    public static void main(String[] args) {
        MyInter myInter=  new MyInter() {
            @Override
            public void eat() {
                System.out.println("吃饭");
            }
        };
        myInter.eat();
    }

}
