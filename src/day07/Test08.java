package day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * java.utils.Arrays 数组工具类，包含操作数组的一些静态方法
 *  public static String toString(int[] a);返回数组内容的字符串形式。
 *  public static void sort(int[] a);对数组进行升序排序。
 *  public static arr[] copyof(int[] original,int length);拷贝指定长度内容
 */

public class Test08 {
    public static void main(String[] args) {
        Integer[] arr={8,2,76,28,3,82};
        ///Arrays.sort(arr);
       /* Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });*/
        /*Arrays.sort(arr,Collections.reverseOrder());
        Arrays.copyOf(arr,3);*/
        double  a=2.5;
        System.out.println(++a);

        System.out.println(Arrays.toString(getReverseArr(arr)));


    }

    public static Integer[] getReverseArr(Integer[] a){
        for (int i = 0; i < a.length; i++) {
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        return a;
    }
}
