package day12.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("c");
        stringList.add("b");
        stringList.add("b");
        stringList.add("b");
        stringList.add("a");
        System.out.println(frequency(stringList,"a"));
    }

    public static int frequency(List<String> arr,String key){
        int count=0;
        for (String s : arr) {
            if (Objects.equals(s,key)){
                count++;
            }
        }
        return count;
    }
}
