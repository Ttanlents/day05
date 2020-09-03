package day12.test1;

import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("石破天");
        collection.add("扫地僧");
        collection.add("小李广");
        collection.remove("石破天");
        System.out.println(collection.size());
        collection.stream().forEach(System.out::println);
        System.out.println(collection.contains("扫地僧"));
        collection.clear();
        System.out.println(collection.isEmpty());
        for (String str:collection){
            System.out.println(str);
        }


    }
}
