package day16.test01;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 余俊锋
 * @date 2020/8/26 17:21
 */
public class Test03 {
    static Random random = new Random();

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Number number=new Number();
        Callable<Integer> c1 = () -> {
            int sum=0;
            /*System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
              sum+=  random.nextInt(100) + 1;
            }
            return sum/10;*/
           while (true){
               Thread.sleep(1000);
               synchronized (number){
                   if (number.getCount()==10){
                      break;
                   }
                   number.getList().add(random.nextInt(100) + 1);
                   number.setCount(number.getCount()+1);
               }
           }
            for (Integer integer : number.getList()) {
                sum+=integer;
            }
            System.out.println(number.getList());
            System.out.println(sum);
           return sum;
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        int sum=0;

        service.submit(c1).get();
        service.submit(c1).get();
        service.submit(c1).get();
        System.out.println(sum/3);


    }
}
