package day15.test01;

/**
 * @author 余俊锋
 * @date 2020/8/25 12:52
 *
 *  线程不安全：在多线程中，只有一份资源同时对该资源进行操作，会导致数据不可控
 *     synchronized加锁，让他们同一时刻只能有一个线程占有该方法
 *
 *  线程安全的：
 *     对象锁：方法、方法代码块、this   只对同一个对象有效,多个对象锁不住
 *     类锁： 类.class    比对象锁更加严格   对同一个对象和多个对象都有效
 *     自定义对象或者静态对象  都可以多为对象锁和类锁
 *
 *     注意：锁的位置很讲究，锁方法，或者把while锁了，不会出现同时执行的情况
 *          推荐：锁代码块
 */
public class Ticket implements Runnable {
   static   int num=100;
    @Override
    public   void run() {
            while (true){
               synchronized (Ticket.class){
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
