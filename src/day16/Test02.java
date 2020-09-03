package day16;

/**
 * @author 余俊锋
 * @date 2020/8/26 11:20
 * <p>
 * 三线程通讯  count标志位+while判断
 */
public class Test02 {
    public static void main(String[] args) {
        Shower2 shower2=new Shower2();
        new Thread(()->{
            try {
                shower2.show1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                shower2.show2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                shower2.show3();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}

class Shower2 {
    int count = 1;

    public void show1() throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            synchronized (this) {

                while (count != 1) {

                    this.wait();
                }
                System.out.print("犯");
                System.out.print("我");
                System.out.print("德");
                System.out.print("绑");
                System.out.print("者");
                System.out.println();
                count = 2;
                this.notifyAll();
            }
        }

    }

    public void show2() throws InterruptedException {
        //虽远必诛
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                while (count != 2) {
                    this.wait();
                }
                System.out.print("虽");
                System.out.print("远");
                System.out.print("必");
                System.out.print("朱");
                System.out.println();
                count = 3;
                this.notifyAll();
            }
        }

    }

    public void show3() throws InterruptedException {
        //虽远必诛
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                while (count!=3){
                    this.wait();
                }
                System.out.print("中");
                System.out.print("华");
                System.out.print("人");
                System.out.print("民");
                System.out.println();
                count=1;
                this.notify();
            }

        }

    }
}

