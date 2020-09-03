package day09.test5;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        new Test().show(animal);
        animal=new Dog();
        animal.eat();
        new Test().show(animal);

    }

    void show(Animal animal){
        if (animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.catchMouse();
        }
        if (animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.lookHome();
        }
    }
}
