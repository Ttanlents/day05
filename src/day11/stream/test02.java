package day11.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class test02 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张三丰");
        list.add("张强");
        list.add("张强");
        list.add("王五");

        ArrayList<String> list2=new ArrayList<>();
        list2.add("李四");
        list2.add("李四");
        list2.add("赵六");
        list2.add("王麻子");
        System.out.println(list);
        Stream<String> stream=list.stream();
        //1.
       // stream.forEach((n)-> System.out.println(n));
        //2.
        Stream<String> a= stream.filter((n)->{
            return n.startsWith("张");
        }).limit(3).skip(1).distinct();

       // a.forEach(System.out::println);

        Stream<String> b=list2.stream().filter((n)->{
            return n.startsWith("李");
        }).limit(2).skip(1).distinct();

       /* b.forEach((n)->{
            System.out.println(n);
        });*/

        Stream.concat(a,b).forEach((n)->{
            System.out.print(n);
        });
    }
}
