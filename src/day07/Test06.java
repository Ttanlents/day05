package day07;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        //统计字符串中出现某个字符的次数
        System.out.println( getCount("a"));

    }

    public static int getCount(String target){
        String message=new Scanner(System.in).next();
        int index=message.indexOf(target);
        int count=0;
        while (index!=-1){
            count++;
            message=message.substring(index+1);  //左闭右开
            System.out.println(message);
            index=message.indexOf(target);
        }
        return count;
    }
}
