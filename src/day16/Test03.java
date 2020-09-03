package day16;

/**
 * @author 余俊锋
 * @date 2020/8/26 12:03
 * <p>
 * 包子的生产者和消费者问题
 */
public class Test03 {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi("韭菜包",10);
        new Thread(new Product(baoZi)).start();
        new Thread(new Consumer(baoZi),"孙悟空").start();
       /* new Thread(new Consumer(baoZi),"猪八戒").start();
        new Thread(new Consumer(baoZi),"唐僧").start();*/
    }
}

class BaoZi {
    private String name;
    private int num;

    public BaoZi() {
    }

    public BaoZi(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

class Product implements Runnable{
    BaoZi baoZi;

    public Product() {
        this.baoZi=new BaoZi();
    }

    public Product(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.getNum()<=5){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("当前包子子数量："+baoZi.getNum()+"生产者生产了一个包子");
                    baoZi.setNum(baoZi.getNum()+1);
                }else {
                    baoZi.notify();
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Consumer implements Runnable{
    BaoZi baoZi;

    public Consumer() {
        this.baoZi=new BaoZi();
    }

    public Consumer(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.getNum()>0){
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("当前包子数量"+baoZi.getNum()+Thread.currentThread().getName()+"吃了一个包子，"+"剩余："+(baoZi.getNum()-1));
                    baoZi.setNum(baoZi.getNum()-1);
                }else {
                    System.out.println(Thread.currentThread().getName()+"发现包子被吃完了，前往生产");
                    baoZi.notifyAll();
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
