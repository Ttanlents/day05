package day10.test01;

public class Test02 {
    static  int  count=5;

    public static void main(String[] args) {
        int num=count;
        for (int i = 0; i < num; i++) {
            System.out.println("循环的i  "+i);
            count--;
        }
        System.out.println(count);
    }
}
