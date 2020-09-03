package day12.test1;

public class Test06<E> {
    public static void main(String[] args) {
       new Test06<String>().function("function");
        new Test06<Integer>().function(500);
    }

    public void function(E e) {
        System.out.println(e);
    }
}
