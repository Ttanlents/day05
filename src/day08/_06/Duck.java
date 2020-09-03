package day08._06;

public class Duck extends Poultry {

    public Duck(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(age+"岁的"+color+name+"游泳");
    }
}
