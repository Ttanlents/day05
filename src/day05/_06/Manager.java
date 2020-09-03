package day05._06;

public class Manager {

    /**
     * name :
     * number : 1
     * salary : 1
     * reward : 1
     */

    private String name;
    private int number;
    private int salary;
    private int reward;

    public Manager() {
    }

    public Manager(String name, int number, int salary, int reward) {
        this.name = name;
        this.number = number;
        this.salary = salary;
        this.reward = reward;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
    public void intro(){
        System.out.println("经理姓名："+name);
        System.out.println("工号："+number);
    }
    public void showSalary(){
        System.out.println("基本工资为："+salary+"奖金："+reward);

    }
    public void work(){
        System.out.println("正在努力做着管理工作");

    }
}
