package day15;

/**
 * @author 余俊锋
 * @date 2020/8/25 10:15
 * 一.线程Thread
 *      多线程：
 *          并发：指两个或多个事件在同一个时间段内发生。
 *          并行：指两个或多个事件在同一时刻发生（同时发生）
 *          一个程序可以有多个进程，一个进程可以有多个线程
 * 步骤：
 * 1.继承Thread重写run方法
 * 2.实现Runable接口，实现run方法
 * 3.使用Thread代理的，匿名内部类
 *
 * 区别：Runable很容易实现资源的共享，thread不适合
 *      线程池只能放入实现Runable或callable
 *
 * <p>
 * 主要方法：
 * start()方法启动线程
 * run() 直接调用run的话并没有启动线程
 *
 * 线程任务结束，线程自动在栈中内存释放
 * 执行一个main时实际上开启一个jvm代表一个进程，至少包括main线程和垃圾回收线程
 *
 * 常用方法：
 *  t1.join();让他线程插队
 *  Thread.yield（） 当前线程礼让
 *  Thread.sleep（）让当前线程休眠毫秒
 *  t1.setDaemon() t1成为守护线程
 *  t1.setPriority设置优先级
 *
 *  线程的状态：
 *      新建、可运行、运行态、（阻塞，等待、运行）、死亡
 *      sleep()阻塞不会释放锁
 *      wait() 不会释放锁，必须配合锁使用
 *
*   线程不安全：在多线程中，只有一份资源同时对该资源进行操作，会导致数据不可控
 *     synchronized加锁，让他们同一时刻只能有一个线程占有该方法
 *
 *  线程安全的：
 *     对象锁：方法、方法代码块、this   只对同一个对象有效,多个对象锁不住
 *     类锁： 类.class    比对象锁更加严格   对同一个对象和多个对象都有效
 *     自定义对象或者静态对象  都可以多为对象锁和类锁
 *
 *     注意：锁的位置很讲究，锁方法，或者把while锁了，不会出现同时执行的情况
 *          推荐：锁代码块
 *  二.锁机制：ReentrantLock和synchronized
 *      可重用锁： ReentrantLock
 *      常用方法：lock()  unlock()
 *
 *  锁两个方法： 同一时刻，同一对象，多个线程调用不同的方法，只会执行其中一个方法
 *  效果等同于，锁this
 *
 *  三.无限等待，线程通讯wait()  notifiyAll()
 *      1.无限等待，一定需要被唤醒，否者一直等待
 *      2.如果有时间限制，在这个期间如果被唤醒，不需要接着等待，可以提前醒来
 *
 */
public class Test01 {



    public static void main(String[] args) {
       /* MyThread myThread = new MyThread();
        myThread.start();
        new Thread(myThread).start();*/

      Thread t1= new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < 500; i++) {
                   System.out.println("守护线程------->"+i);
               }
           }
       });

       Thread t2=new Thread(()->{

           for (int i = 0; i < 1000; i++) {
               System.out.println("第二个"+i);
               if (i==10){
                   System.out.println("礼让位置");
                   try {
                      // t1.join();  插队
                      // Thread.yield();  礼让
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }

           }

       });
        Thread t3=new Thread(()->{

            for (int i = 0; i < 1000; i++) {
                System.out.println("第三个"+i);
                if (i==10){
                    System.out.println("第二能够礼让位置");
                    try {
                        // t1.join();  插队
                        // Thread.yield();  礼让
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }

        });
      // t1.setPriority(10); 优先级高
      // t2.setPriority(1);  优先级低
        t1.setDaemon(true);
       t1.start();
       t2.start();
       t3.start();


    }

    public static void test() {
        System.out.println(Thread.currentThread());
        MyThread myThread = new MyThread("我是猪");
        myThread.start();
        System.out.println(myThread);
        System.out.println("word");
    }
}
