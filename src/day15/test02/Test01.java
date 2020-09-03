package day15.test02;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 余俊锋
 * @date 2020/8/25 16:52
 *
 * 可重用锁： ReentrantLock
 *  常用方法：lock()  unlock()
 */
public class Test01 {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> map;
        //创建锁对象
        ReentrantLock lock = new ReentrantLock();

        new Thread() {
            @Override
            public void run() {


                while (true) {
                    //开启锁
                    lock.lock();
                    System.out.print("虽");
                    System.out.print("远");
                    System.out.print("必");
                    System.out.print("诛");
                    System.out.println();
                    //释放锁
                    lock.unlock();
                }
            }
        }.start();


        new Thread() {
            @Override
            public void run() {

                while (true) {
                    //开启锁
                    lock.lock();
                    System.out.print("犯");
                    System.out.print("我");
                    System.out.print("中");
                    System.out.print("华");
                    System.out.print("者");
                    System.out.println();

                    //释放锁
                    lock.unlock();
                }

            }
        }.start();
    }
}
