package day16;

import java.util.concurrent.*;

/**
 * @author 余俊锋
 * @date 2020/8/26 13:14
 */
public class Test07  implements Callable<Integer> {
    /**
     * 线程池
     *  1.固定的线程池
     *  2.带缓存
     *
     *  callable线程+返回值
     *
     *  计数器：   countDownLatch   await()在run阻塞   countdown-1才能放行
     * @param args
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
       // ExecutorService executorService1 = Executors.newCachedThreadPool();
        //缓存线程池
       // ExecutorService executorService2 = Executors

        Test07 callable=new Test07();
        service.submit(callable);
        Future<Integer> result = service.submit(callable);
        FutureTask<Integer> futureTask=new FutureTask<>(callable);
        new Thread(futureTask).start();


    }

    @Override
    public Integer call() throws Exception {
        System.out.println("aaaaaa");
        return 0;
    }
}
