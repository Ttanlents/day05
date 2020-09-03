package day15;

/**
 * @author 余俊锋
 * @date 2020/8/25 10:16
 */
public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println("当前线程名字：" + Thread.currentThread().getName());
    }
}
