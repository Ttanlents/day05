package day08._07;

public class Manger  extends Employee{

    public Manger(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void eat() {
        System.out.println(name+"在吃鱼");
    }

    @Override
    public void work() {
        System.out.println(name+"在工作，管理其他人");
    }
}
