package day16;

/**
 * 双线程通讯
 * wait+ notify
 */
public class Test {
    public static void main(String[] args) {
        Shower s = new Shower();
        new Thread(() -> {
            s.show1();
        }).start();

        new Thread(() -> {
            s.show2();
        }).start();
    }
}

class Shower {


    public void show1() {

        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                System.out.print("犯");
                System.out.print("我");
                System.out.print("德");
                System.out.print("绑");
                System.out.print("者");
                System.out.println();
                this.notify();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public void show2() {
        //虽远必诛
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("朱");
                System.out.println();
                this.notify();
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
