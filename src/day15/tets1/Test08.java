package day15.tets1;

/**
 * @author 余俊锋
 * @date 2020/8/25 19:01
 */
public class Test08 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        new Thread(ticket,"a").start();
        new Thread(ticket,"b").start();
        new Thread(ticket,"c").start();
        new Thread(ticket,"d").start();


    }
}
class Ticket extends Thread{
    int num=100;
    int sum=0;
    @Override
    public void run() {
        while (true){
            if (num<=0){
                break;
            }
            synchronized (this){
                if (num<=0){
                    break;
                }
                sum++;
                System.out.println("当前窗口为："+Thread.currentThread().getName()+"卖了一场票,剩余"+(100-sum));
                num--;
            }
        }

    }
}
