package day13.test01;

import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(6);
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.pop(); //后进先出
        System.out.println( list.get(0));
        list.set(0,7);
        System.out.println(list);
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list);
        list.clear();
    }
}
