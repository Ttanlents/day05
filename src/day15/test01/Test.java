package day15.test01;

/**
 * @author 余俊锋
 * @date 2020/8/25 12:53
 */
public class Test {
    public static void main(String[] args) {
      /* Ticket02 t1 = new Ticket02();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();*/

        new Thread(new Ticket02()).start();
        new Thread(new Ticket02()).start();
        new Thread(new Ticket02()).start();


    }
}
