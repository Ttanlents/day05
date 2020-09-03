package day12.test1;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("abc1");
        collection.add("abc2");
        collection.add("abc3");
        collection.add("abc4");
        Iterator<String> it = collection.iterator();
        while (it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }
    }
}
