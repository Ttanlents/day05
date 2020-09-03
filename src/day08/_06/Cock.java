package day08._06;

public class Cock extends Poultry {

    public Cock(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age+"岁的"+color+name+"在打鸣");
    }
}
