package day08._03;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("旺财","黄色",1000);
        dog.eat();
        dog.lookHome();
        Cat cat=new Cat("波斯猫","咖啡色",1000);
        cat.eat();
        cat.catchMouse();
    }
}
