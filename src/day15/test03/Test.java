package day15.test03;

/**
 * @author 余俊锋
 * @date 2020/8/25 17:05
 *
 * 对象锁 锁住资源对象
 */
public class Test {
    public static void main(String[] args) {
        TicketBean ticketBean=new TicketBean("G9527",100);
        Ticket ticket=new Ticket(ticketBean);
        new Thread(ticket,"广州南").start();
        new Thread(ticket,"深圳北").start();
        new Thread(ticket,"武汉").start();
    }
}
