package day04;

/**
 * 方法的重载： 一个类允许存在一个以上的重名方法，只要参数列表不一样即可
 *  参数列表不一样：
 *      数据类型不一样
 *          顺序不一样
 *          个数不一样
 *          方法的重载和返回值类型以及权限修饰没有关系，之和参数列表有关系
 */

//练习： 1.求两个数的和  byte1 short2 char2 int4 long8 float4 double8


public class TestFunction02 {

    public static void main(String[] args) {

    }
    public  static int getSum(byte a,short b){
        return a+b;
    }
    public  static int getSum(byte a,int b){
        return a+b;
    }
    public  static int getSum(byte a,long b){
        return (int)(a+b);
    }
    public  static int getSum(byte a,float b){
        return (int)(a+b);
    }
    public  static int getSum(byte a,double b){
        return (int)(a+b);
    }
    public  static double getSum(float a,double b){
        return (a+b);
    }

    public  static float getSum(float a,char b){
        return a+b;
    }

}
