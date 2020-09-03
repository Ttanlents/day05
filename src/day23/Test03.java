package day23;

/**
 * @author 余俊锋
 * @date 2020/9/3 15:41
 */
public class Test03 {
    static int cup = 0;
    static Object object = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
           while (true){
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (object) {
                   if (cup<100){
                       cup ++;
                       System.out.println("销售途径:"+Thread.currentThread().getName()+",卖出第"+cup+"个，剩余"+(100-cup)+"个");
                   }
               }
           }
        }, "实体店").start();

        new Thread(() -> {
           while (true){
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (object) {
                   if (cup<100){
                       cup ++;
                       System.out.println("销售途径:"+Thread.currentThread().getName()+",卖出第"+cup+"个，剩余"+(100-cup)+"个");
                   }
               }
           }
        }, "官网").start();

    }
}
