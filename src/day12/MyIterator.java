package day12;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器  Iterator<String> it=collection.iterator();
 *  it.next会把指针移动一位
 *      使用注意事项：1.多次使用it.next 可能会造成指针越界noSuchElementException
 *                     2.it.hashNext只会判断是否存在下一个元素
 *                      3.stream流只能在集合中使用
 */

public class MyIterator {
    public static void main(String[] args) {
        ArrayList<String> collection=new ArrayList<>();
        collection.add("石破天");
        collection.add("扫地僧");
        collection.add("小李广");
        Iterator<String> it=collection.iterator();
        for(;it.hasNext();){
            System.out.println(it.next());
            System.out.println(it.next());
        }
    }
}
