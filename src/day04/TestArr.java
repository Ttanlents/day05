package day04;

/**
 * 数组： 是一个容器，一次性存放多个值 同类型的数据
 * 数组的长度固定的
 * 创建数组的三种方式：
 * 1.int[] arr=new int[5];  内存在堆中
 * 2.int[] arr=new int[]{};
 * 3.int[] arr={};
 * 直接打印输出的是数组的地址值。[I@1540e19d
 * [   表示这是一个数组
 * I   表示数组中的数据是int
 *
 * @ 没有意义 连接符
 * 1540e19d 哈希值hashcode  地址值
 */
public class TestArr {
    /**
     * 实参：如果是基本类型或者String，则实参不会变（传的是值）；
     * 如果是对象集合或者数组，则实参会改变（传的是引用）。
     * @param args
     */

    public static void main(String[] args) {
        int arr[] = new int[5];
        int[] arr1 = new int[]{};
        int[] arr2 = {1, 2, 3};
    }


}
