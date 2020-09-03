package day16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * @author 余俊锋
 * @date 2020/8/26 17:07
 *
 * 模拟并发
 */
public class Test08 {
    public static void main(String[] args) {
        CountDownLatch countDownLatch=new CountDownLatch(1);
        MyCown myCown=new MyCown(countDownLatch);
        for (int i = 0; i < 1000; i++) {
            new Thread(myCown).start();
        }
       countDownLatch.countDown();
    }
}
class MyCown implements Runnable{
    CountDownLatch countDownLatch;
   final static SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh-mm-s sss");

    public MyCown(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        try {
           countDownLatch.await(); //阻塞
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" ,"+dateFormat.format(new Date()));
    }
}
