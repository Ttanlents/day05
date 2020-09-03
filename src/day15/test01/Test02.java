package day15.test01;

/**
 * @author 余俊锋
 * @date 2020/8/25 16:15
 *
 *
 * 使用静态的对象，作为类锁的功能
 */
public class Test02 {

    public static void main(String[] args) {
        Object object=new Object();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
                synchronized (object){
                    System.out.print("犯");
                    System.out.print("我");
                    System.out.print("中");
                    System.out.print("华");
                    System.out.print("者");
                    System.out.println();
                }

            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 100; i++) {
               synchronized (object){
                   System.out.print("虽");
                   System.out.print("远");
                   System.out.print("必");
                   System.out.print("诛");
                   System.out.println();
               }
            }
        }).start();
    }
}
