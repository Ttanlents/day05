package day06._02;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int c=scanner.nextInt();
        System.out.println("请输入第二个数：");
        int d=scanner.nextInt();
        System.out.println("请输入第三个数：");
        int e=scanner.nextInt();
        System.out.println("三个数，最大值为: "+getMaxValue(c,d,e));
    }
    public static int getMaxValue(int ...a){
        int max=a[0];
        for (int i:a){
            if (i>max){
                max=i;
            }
        }
        return max;
    }
}
