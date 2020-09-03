package day03.idemo;

import java.io.*;

/**
 *   一个星期  if else
 */

public class Test02 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr= new InputStreamReader(System.in); //转换流
        BufferedReader bf= new BufferedReader(isr); //缓冲流
        String message=bf.readLine();
        int week=Integer.parseInt(message);
        if (week==1){
            System.out.println("周一");
        }else  if (week==2){
            System.out.println("周二");
        }else  if (week==3){
            System.out.println("周三");
        }else  if (week==4){
            System.out.println("周四");
        }else  if (week==5){
            System.out.println("周五");
        }else  if (week==6){
            System.out.println("周六");
        }
        else  if (week==7){
            System.out.println("周日");
        }
    }
}
