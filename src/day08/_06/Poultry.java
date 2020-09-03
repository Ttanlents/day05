package day08._06;

public abstract class Poultry {
    String name;
    int age;
    String color;

    public Poultry(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public abstract void eat();
}
