package day07._06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String mgc="奥斑马";
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String message=scanner.next();
        System.out.println(message);
        System.out.println(message.replace("奥斑马","*"));
    }
}
