package day10.test05;

import java.util.Arrays;

public class Test  {


    public static void main(String[] args) {
        Person[] p=new Person[]{
                new Person("马云",12),
                new Person("马化腾",18),
        };
       Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }
}
