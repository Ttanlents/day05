package day16.test01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 余俊锋
 * @date 2020/8/26 17:46
 */
public class Test04 {
    public static void main(String[] args) {
        Runnable runnable=()->{
            int sum=1;
            for (int i = 1; i < 10; i++) {
                sum*=i;
            }
            System.out.println(Thread.currentThread().getName()+",结果："+sum);
        };
        Runnable runnable2=()->{
            int sum=1;
            for (int i = 1; i < 5; i++) {
                sum*=i;
            }
            System.out.println(Thread.currentThread().getName()+",结果："+sum);
        };
        Runnable runnable3=()->{
            int sum=1;
            for (int i = 1; i < 8; i++) {
                sum*=i;
            }
            System.out.println(Thread.currentThread().getName()+",结果："+sum);
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        service.submit(runnable);
        service.submit(runnable2);
        service.submit(runnable3);

    }
}
