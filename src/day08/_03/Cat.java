package day08._03;



public class Cat extends Animal {

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }

    public void catchMouse(){
        System.out.println(name+"抓老鼠");
    }
}
