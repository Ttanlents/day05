package day14;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 一.HashMap双序列集合
 *                      key  value都可以为空，
 *                      key不能重复，是无序的集合
 * LinkedHashMap集合
 *                      有序的  不可重复的
 *          注意：
 *              为保证两个对象不重复，我们总是重写hashCode() 和equals()方法
 *
 *         常用的方法: put(key,value);
 *                      remove(object key)
 *                      get(object key)
 *                      containsKey(object key)
 *          常用的遍历方式：
 *                  map.keySet()返回key的单序列集合
 *                  map.values()value的单序列集合
 *                  map.entrySet() entry键值对(实现类是Node节点) 对象 的单序列集合
 *
 * jdk9 优化了集合反复添加的方法
 *              静态方法： 注意返回的集合不可变（调用add方法执行会报错）
 *          Set.of(E ...a)
 *          List.of(E ...a)
 *          Map.of(E ...a)
 *  二.异常体系: Throwable的子类：Error和 Exception
 *
 *                 Error:无法处理的错误
 *                 Exception:可以处理的异常
 *
 *      常用方法：printStackTrace()打印异常信息
 *                  getMessage()发生异常原因
 *
 *      Exception类包含两个子类：
 *          checked:编译时异常，比如日期的解析,必须手动处理不能丢给虚拟机
 *          RuntimeException:运行时异常（程序执行时产生的异常），除了两种处理方式，还能够丢给虚拟机处理（自己不作处理）
 *
 *        自定义异常：继承 RuntimeException,生成构造器
 *                  throw 该对象 抛出异常
 *
 * 异常处理方式：
 *      1.try catch finally 捕获异常
 *      规范：try里面放的是可能发生异常的代码，不会放生异常的代码不能放在try里面
 *      2.throws声明抛出异常类,让调用者去处理异常，自已不作处理，非常不负责任
 *
 *      finally{}  当我们希望不管是否发生异常都去执行的代码
 *           finally中的return 值 一定会返回
 *          try中发生多个异常，捕获多个异常，但是代码执行时，只会捕获第一个异常
 *          程序停止了，不会捕获第二个异常
 *
 *      1.多次捕获，多次处理 try catch try catch
 *      2.一次捕获，多次处理 try catch catch
 *      3.一次捕获，一次处理 try catch
 *        父类（Exception）异常要放在最后一个catch中
 *
 *      扩展：子类继承父类中，子类抛出的异常只能和父类相同，或者是子类异常，或者不抛出异常
 *
 *   自定义异常：
 *          通过继承异常类，RuntimeException
 *          默认抛出的异常会给虚拟机处理（如果继承Exception会发生编译时异常）
 *          可以手动try catch 捕获处理
 */

public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        Map<String, String> map = new LinkedHashMap<>();
       map.put("黄晓明","杨颖");
        map.put("黄晓明","马伊琍");
        map.put(null,null);
        map.put(null,"王菲");


        for (String value : map.values()) {
            System.out.println(value);
        }
        for (String s : map.keySet()) {
            System.out.println(s+"-->"+map.get(s));
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }
        for (Map.Entry<String,String> entry:map.entrySet()){

        }

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey()+"迭代器"+entry.getValue());
        }


    }

    public static void getException(){
        throw new ArithmeticException("算术一场");
    }
}
