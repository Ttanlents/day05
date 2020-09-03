package day08._03;

public class Dog extends Animal {

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }

    public void lookHome(){
        System.out.println(name+"在看家");
    }
}
