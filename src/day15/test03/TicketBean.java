package day15.test03;

/**
 * @author 余俊锋
 * @date 2020/8/25 16:59
 */
public class TicketBean {
    private String name;
    private int num;

    public TicketBean(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public TicketBean() {
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
