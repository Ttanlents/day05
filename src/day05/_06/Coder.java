package day05._06;

public class Coder {


    private String name;
    private String number;
    private int salary;

    public Coder() {
    }

    public Coder(String name, String number, int salary) {
        this.name = name;
        this.number = number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void intro(){
        System.out.println("程序员姓名："+name);
        System.out.println("工号："+number);
    }
    public void showSalary(){
        System.out.println("基本工资为："+salary+"奖金无");

    }
    public void work(){
        System.out.println("正在努力写代码");

    }
}
