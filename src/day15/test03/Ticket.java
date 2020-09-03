package day15.test03;

/**
 * @author 余俊锋
 * @date 2020/8/25 17:00
 */
public class Ticket implements Runnable{
    private TicketBean ticketBean=new TicketBean();

    public Ticket(TicketBean ticketBean ){
        this.ticketBean=ticketBean;
    }

    @Override
    public void run() {
        while (true){
            synchronized (ticketBean){
                int num=ticketBean.getNum();
                if (num<=0){
                    break;
                }
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在卖票："+ticketBean.getName()+"票号："+ticketBean.getNum());
                ticketBean.setNum(num-1);
            }
        }
    }
}
