package day04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


/**
 * 数组的核心：对索引进行操作
 *  索引：数组中的每一个元素都要一个编号，这个编号叫做索引
 *      索引从0开始
 *     取值：
 *          数组名：
 *          数组名[索引]=值
 *       数组的长度 最大索引=length-1
 * 常见错误：
 *              1.数组索引越界
 *         基本数据类型：
 *         byte  short int long 0
 *         char string  \u0000(" ")  空字符(null)
 *         float double  0.0
 *         boolean false
 */

public class TestArr2 {
    public static void main(String[] args) {
        float[] arr=new float[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Integer a[]={1,2,3,4,5,6,7};
        a=myReverseArray(a);
        System.out.println(printArray(a));
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * 求数组中的最大值
     * @return
     */
    public static   int getMaxValue(int arr[]){
        int maxValue=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

    public static int[] reverseArr(int arr[]){
        //end 最大的索引
        for (int start = 0,end=arr.length-1; start <end; start++,end--) { //指针法
                int temp=arr[end];
                arr[end]=arr[start];
                arr[start]=temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    //规律法
    public static int[] reverseArr2(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr.length-1-i;
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    public static Integer[] myReverseArray(Integer arr[]){
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        return arr;
    }


     // T E V
    public static String printArray(Object[] objects){
        int count=0;
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (Object ob:objects){
            count++;
            if (count==objects.length-1){
                sb.append(ob+"]");
                break;
            }
            sb.append(ob+",");
        }
        return sb.toString();
    }
}
