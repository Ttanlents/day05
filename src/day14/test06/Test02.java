package day14.test06;

import java.util.Random;

public class Test02  {
    public static void main(String[] args) {
        new Thread(()->{
            Random random=new Random();
            int sum=0;
            for (int i = 0; i < 10; i++) {
                sum+= random.nextInt(901)+100;
            }
            System.out.println(sum);
        }).start();
    }
}
