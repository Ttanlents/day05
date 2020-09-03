package day15.tets1;

/**
 * @author 余俊锋
 * @date 2020/8/25 18:48
 */
public class Test07 {
    public static void main(String[] args) {
        Car car = new Car();
        new Thread(car,"前门上车").start();
        new Thread(car,"中门上车").start();
        new Thread(car,"后门上车").start();
    }
}

class Car implements Runnable{
 int seat=80;
 int sum=0;
    @Override
    public void run() {
        while (true){
            if (seat<=0){
                break;
            }
            synchronized (this){
                if (seat<=0){
                    break;
                }
                sum++;
                System.out.println(sum);
                System.out.println(Thread.currentThread().getName()+seat+"---还剩座位："+(80-sum));
                seat--;
            }
        }
    }
}
