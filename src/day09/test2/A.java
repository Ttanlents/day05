package day09.test2;

public interface A {

    public void showA();

    default void showB(){
        System.out.println("BBBB");
    }
}
