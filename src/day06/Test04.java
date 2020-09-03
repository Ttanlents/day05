package day06;

import java.util.ArrayList;
import java.util.List;

/**
 *  特点;1.大小可变的数组的实现
 *            2.<E>(泛型)：当前集合中存放的统一的都是什么类型的。泛型只能是引用类型
 *             3.直接打印集合，不是地址值。
 *             4.创建集合时，右侧的<>里面的泛型在1.7后可以省略
 *      构造方法：
 *         1.无参构造是初始容量为10的空列表
 *       成员方法;
 *            1.boolean add(E e)将指定的元素添加到此列表的尾部。
 *             2.E remove(int index)移除列表中指定位置上的元素。返回删除的元素
 *             3.E get(int index)返回指定下标 的元素
 *             4.int size() 返回此列表中的元素数。
 */

public class Test04 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
      boolean flag=  list.add("name");
      String element=  list.get(0);
       String element1= list.remove(0);
       int getSize= list.size();
        System.out.println(element+element1+getSize);

    }
}
