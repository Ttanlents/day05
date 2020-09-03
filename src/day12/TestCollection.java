package day12;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection=new ArrayList<>();
        collection.add("石破天");
        collection.add("扫地僧");
        collection.add("小李广");
       collection.stream().forEach(System.out::println);
        System.out.println(collection.contains("扫地僧"));
        collection.stream().filter((n)->{
            return n.startsWith("");
        });
        System.out.println(collection.isEmpty());

    }
}
