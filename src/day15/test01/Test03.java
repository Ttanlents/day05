package day15.test01;

/**
 * @author 余俊锋
 * @date 2020/8/25 16:29
 *
 * 锁两个方法： 同一时刻，同一对象，多个线程调用不同的方法，只会执行其中一个方法
 * 效果等同于，锁this
 */
public class Test03 {
    public static void main(String[] args) {

        Shower s = new Shower();
        new Thread(() -> {
            while (true) {
                s.show1();
            }
        }).start();
        new Thread(() -> {
            while (true) {
                s.show2();
            }
        }).start();

    }
}
