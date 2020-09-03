package day09.test5;

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("狗吃骨头");
    }

    void lookHome(){
        System.out.println("狗看家");
    }
}
