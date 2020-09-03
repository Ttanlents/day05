package day06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
    private static Scanner scanner=  new Scanner(System.in);;
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
         /*System.out.println("请输入两个数：");
       int a= scanner.nextInt();
       int b=scanner.nextInt();
        System.out.println("两个数的和为： "+getSum(a,b));
        System.out.println("请输入三个数：");
        int c=scanner.nextInt();
        int d=scanner.nextInt();
        int e=scanner.nextInt();
        System.out.println("最大值为: "+getMaxValue(c,d,e));*/
        /*try {
            Scanner sc=new Scanner(new File("Module1/Read06.md"));
            while (sc.hasNextLine()) {
                String aLong = sc.nextLine();
                System.out.println(aLong);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        Scanner sc1=getScanner();
        Scanner sc2=getScanner();
        System.out.println(sc1.hashCode());
        System.out.println(sc2.hashCode());

    }

    /**
     * 求和
     * @param a
     * @return
     */
    public static int getSum(int ...a){
        int max=0;
        for (int i:a){
            max+=i;
        }
        return max;
    }

    /**
     * 求最大值
     * @param a
     * @return
     */
    public static int getMaxValue(int ...a){
        int max=a[0];
        for (int i:a){
           if (i>max){
               max=i;
           }
        }
        return max;
    }

    public static Scanner getScanner(){

        return  scanner;
    }
}
