package day13.test01;

import java.util.LinkedList;

public class Test04 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(4);
        list.addLast(5);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
    }
}
