package day09.test5;

public class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }
    void catchMouse(){
        System.out.println("努力吃老鼠");
    }
}
