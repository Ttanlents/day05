package day14.test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listUtils {

    public static List<String> of(String ...str){
     return  new ArrayList<>(Arrays.asList(str));
    }

    public static List<Integer> of(Integer ...integers){
        return   new ArrayList<>(Arrays.asList(integers));
    }

    public static List<List<Integer>> of(List<Integer> ...integers){
        return   new ArrayList<>(Arrays.asList(integers));
    }

}
