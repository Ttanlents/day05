package day11.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream流
 *     成员方法，返回值都是this：
 *      1.foreach+Lambda表达式 遍历
 *      2.collectors 转化为集合
 *      3.filter 过路器+过滤条件
 *      4.limit 截取限制 取 几个
 *      5.skip 跳过steam中前2个元素
 *      6.静态方法： concat 合并两个Stream流
 *      7.distinct 去重
 *  包装类：valueOF() 装箱  parsexxx(String a)拆箱
 */

public class test01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Stream<String> stream=list.stream();
        //1.遍历stream
        stream.forEach((n)->{
            System.out.println(n);
        });
        //2.仅限打印
        stream.forEach(System.out::println);

        //过滤器filter
      stream=  stream.filter(n->{
            System.out.println(n);
            return n.startsWith("a");  //返回满足条件的布尔型  true false
        });

        List<String> listA=stream.collect(Collectors.toList());


    }
}
