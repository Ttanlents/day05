package day15.tets1;

/**
 * @author 余俊锋
 * @date 2020/8/25 18:15
 */
public class Test05 {
    public static void main(String[] args) {
        Cave cave=new Cave();
        for (int i = 0; i < 10; i++) {
            new Thread(cave,""+i).start();
        }





    }
}
class Cave implements Runnable{
    @Override
    public void run() {
       synchronized (this){
           System.out.println(Thread.currentThread().getName()+"正在过山洞！");
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}

