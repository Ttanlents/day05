一.线程通讯
 1.线程通讯
    使用int count=1或者2 ，作为标志位实现线程之间的等待和唤醒
    主要方法(父类是Object)：
        wait(); 让线程等待
        notify()：唤醒在当前锁对象中随机的一条线程
        notifyAll()：唤醒当前锁对象对应的所有线程(效率低)
        
  2.Lock锁实现多条线程通信
         ReentrantLock lock = new ReentrantLock();
         c1=lock.newCondition();
        c2=lock.newCondition();
        c3=lock.newCondition();
        lock.lock()//开启锁
        await()//使用c1监视器让当前线程等待
         c2.signal(); //唤醒c2监视器监视的线程
          lock.unlock();//释放锁
          
    3.生产者消费者模式
        案例：包子BaoZo作为共享资源，product生产，consumer消费
        
    4.sleep和wait方法的区别？

sleep():必须传入睡眠的时间毫秒值,和毫秒值加纳秒值

wait():可以不用指定时间,如果指定时间代表线程不会立马等待,而是指定时间过后再等待

sleep():在休眠指定时间后自动醒来,并且休眠时间不释放锁

wait():等待过程中不会自动醒来,而是调用notify()方法来唤醒,并且调用时里面释放锁

wait()方法必须是锁对象来调用，而且必须是在同步代码块中执行，否则会出现`IllegalMonitorStateException`异常
        
二.使用线程池中线程对象的步骤：

1. 创建线程池对象。
2. 创建Runnable接口子类对象。(task)
3. 提交Runnable接口子类对象。(take task)
4. 关闭线程池(一般不做)。

例子：
ExecutorService service = Executors.newFixedThreadPool(2);//固定线程池
                        Executors.newCachedThreadPool();//缓冲线程池
                         Executors.newSingleThreadExecutor()//单例线程池
service.submit(r);

(2)callable接口使用方法（有返回值）：

    1.Future<Integer> result = service.submit(callable);
        FutureTask<Integer> futureTask=new FutureTask<>(callable);
        new Thread(futureTask).start();
        
     2. service.submit(callable);
     
(3)countDownlatch计数器（模拟高并发）
计数器：   countDownLatch   await()在run阻塞等待人齐   
            在main方法中，countdown-1才能放行
 




