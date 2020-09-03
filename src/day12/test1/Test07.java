package day12.test1;

import java.util.HashMap;

public class Test07 {
    public static void main(String[] args) {
        Imple01<Integer> imple01 = new Imple01();
        imple01.show("我是泛型string");

        Imple02<Integer> imple02 = new Imple02();
        imple02.show(5555);
        System.out.println(imple01.show2(new HashMap<>()).hashCode());
    }
}
