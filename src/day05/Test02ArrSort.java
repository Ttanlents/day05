package day05;

import day04.PrintArrutils;

import java.util.Arrays;

public class Test02ArrSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mysort(new int[]{8,9,7,6,1,2,3})));
    }

    /**
     * 选择索引  循环遍历比较大小  第一轮得出a[0]为1  第二轮啊a[1]为2
     * @param a
     * @return
     */
    public static int[] mysort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j=i+1;j<a.length;j++){
                if (a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }

    /**
     * 选择索引改进
     * 改进空间 内存的频繁交互
     */
    public static int[] mysort11(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            //new int[]{8,9,7,6,1,2,3}
            int num=a[i]; //minValue
            int index=i;
            for (int j=i+1;j<a.length;j++){
                if (num>a[j]){
                    num=a[j];
                   index=j;
                }
            }
            if (i!=index){
                int temp=a[index];
                a[index]=a[i];
                a[i]=temp;
            }

        }
        return a;
    }


    /**
     * 冒泡就是 相邻的比较然后交换位置  一轮得到一个最大值  共a.length-1 轮
     * @param a
     * @return
     */
    public static int[] mysort2(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    /**
     * 冒泡优化
     * @param a
     * @return
     */
    public static int[] mysort22(int[] a){
        boolean flag=true;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    flag=false;  //这里不执行表示数组是有序的
                }
            }
            if (flag){
              break;
            }
        }
        return a;
    }

}
