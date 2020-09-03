package day13.test02;

import java.util.Iterator;
import java.util.LinkedList;

public class Test03 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        String[] str={"12345","12345","4561563","5346123416","67891","15463156"};
        for (String s : str) {
            if (list.contains(s)){
                continue;
            }
           list.add(s);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        /*for (String s : list) {
            System.out.println(s);
        }*/
    }
}
