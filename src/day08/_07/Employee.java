package day08._07;

public abstract class Employee {
    String id;
    String name;
    double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract void eat();
    public abstract void work();
}
