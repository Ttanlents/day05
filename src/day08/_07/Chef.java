package day08._07;

public class Chef  extends Employee{
    public Chef(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void eat() {
        System.out.println("工号："+id+"姓名"+name+"在吃肉"+"工资"+salary);
    }

    @Override
    public void work() {
        System.out.println("工号："+id+"姓名"+name+"在炒菜"+"工资"+salary);
    }
}
