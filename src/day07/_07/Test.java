package day07._07;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入一个qq");
        String qq=new Scanner(System.in).next();
        if (checkQQ(qq)){
            System.out.println("这个qq是正确的");
        }else {
            System.out.println("这个qq是错误的");
        }
    }

    public static boolean checkQQ(String qq){
        int length=qq.length();
        if (!(length>=5&&length<=12&&qq.indexOf(0)==0)){
            return false;
        }
        char[] a=qq.toCharArray();
        for (char i:a){
            if (!(i>='0'&&i<='9')){
                return false;
            }
        }
        return true;
    }
}
