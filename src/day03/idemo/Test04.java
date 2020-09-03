package day03.idemo;

/**
 * 三元表达式的互换
 *      条件表达式：语句体1：语句体2
 *
 */

public class Test04 {
    public static void main(String[] args) {
        boolean flag=true;
       flag=  flag?true:false;

       int num1=10;
       int num2=10;

       int result=num1==num2?10:0;
        System.out.println(result);

    }
}
