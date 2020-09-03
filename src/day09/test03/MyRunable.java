package day09.test03;

public class MyRunable  extends Thread  {
    @Override
    public void run() {

    }

    public static void main(String[] args) {

        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("跑步");
            }
        }).start();

        for (int i = 0; i < 100; i++) {
            System.out.println("游泳");
        }
    }
}
