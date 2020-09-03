package day10.test1;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        HandleAble handleAble=new HandleAble() {
            @Override
            public void HandleString(String num) {
                num=num.substring(0,num.indexOf("."));
                System.out.println(num);
                int origin=Integer.parseInt(num);
                System.out.println("取整数为："+origin);

            }
        };

        HandleAble handleAble2=new HandleAble() {
            @Override
            public void HandleString(String num) {
                System.out.println("原数："+num);
                int number=4;
                int index=   num.indexOf(".");
                char theChar1=num.charAt(index+number);
                char theChar= num.charAt(index+number+1);
                String start=num.substring(0,index+1);

                //四舍五入
                if (theChar>='5'){
                    theChar1=(char) (theChar1+1);
                }


                System.out.println("该数代表是否四舍五入："+theChar);
                String end=num.substring(index+1,index+number);
                System.out.println("保留四位小数后："+start+end+theChar1);
            }
        };
        Scanner scanner=new Scanner(System.in);
        String message=scanner.next();
         handleAble.HandleString(message);
         handleAble2.HandleString(message);
    }
}
