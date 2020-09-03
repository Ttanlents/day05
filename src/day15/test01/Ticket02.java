package day15.test01;

/**
 * @author 余俊锋
 * @date 2020/8/25 15:52
 */
public class Ticket02 implements Runnable {
       static    int num=100;
       private static   Object obj=new Object();
    @Override
    public   void run() {
        while (true){
            synchronized (obj){
                if (num<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"抢到了"+num);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num--;

            }
            }

    }
}
