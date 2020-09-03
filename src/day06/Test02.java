package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 */

public class Test02 {
    private static int[] a=getArr();
    public static void main(String[] args) {

        System.out.println(Arrays.toString(a));
        System.out.println(getMaxValue(a));
    }

    public static int getMaxValue(int arr[]){

        int maxvalue=0;
        for (int a:arr){
            if (a>maxvalue){
                maxvalue=a;
            }
        }
        return maxvalue;
    }
    public static int[] getArr(){
        int[] arr=new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i]=new Random().nextInt(101);
        }
        return arr;
    }
}
