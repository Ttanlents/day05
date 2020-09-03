package day12.test1;

import java.util.Map;

public class Imple01<E> implements Inter<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }


    public Map show2(Map<? extends E,? extends E > m) {

            return  m;
    }
}
