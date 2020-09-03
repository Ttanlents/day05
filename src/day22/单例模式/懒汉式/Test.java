package day22.单例模式.懒汉式;

import java.util.concurrent.CountDownLatch;

/**
 * @author 余俊锋
 * @date 2020/9/3 10:47
 */
public class Test {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(1);
        long start=System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Singleton2.getInstance());
            }).start();
        }
        countDownLatch.countDown();
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
