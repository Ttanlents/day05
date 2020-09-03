package day03.forDemo;

/**
 * do{
 * 循环体；
 * 步进语句；
 * }while(条件表达式);
 * 不管是否满足条件，都会执行一次
 * <p>
 * 区别：1.不管是否满足条件，都会执行一次
 * 2.for初始化是在内部  循环结束初始化变量释放
 * 3.while和do while 是在外部 初始化变量可以继续使用
 * <p>
 * 三种死循环
 * for(;;)   while(true){}  do{}while(true);
 */

public class TestDoWhile {
    public static void main(String[] args) {
        //1.求100的和 do while    2.偶数和  奇数和
        int num = 0;
        int sum = 0;
        int evenSum = 0;
        int oddSum = 0;
        do {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
            sum += num;
            num++;
        } while (num <= 100);
        System.out.println(sum);
        System.out.println(evenSum);
        System.out.println(oddSum);

        //1.求100的和 while   2.偶数和  奇数和
        int num1 = 0;
        int sum1 = 0;
        int evenSum1 = 0;
        int oddSum1 = 0;
        while (num1 <= 100) {
            if (num1 % 2 == 0) {
                evenSum1 += num1;
            } else {
                oddSum1 += num1;
            }
            sum1 += num1;
            num1++;
        }
        System.out.println(sum1);
        System.out.println(evenSum1);
        System.out.println(oddSum1);

        //3.求8的阶乘 do  while
        int sum3 = 1;
        int num3 = 1;
        do {
            sum3 *= num3;
            num3++;
        } while (num3 <= 8);
        System.out.println(sum3);


        //3.求8的阶乘   while
        int sum4 = 1;
        int num4 = 1;
        while (num4 <= 8) {
            sum4 *= num4;
            num4++;
        }
        System.out.println(sum4);


        //4.求水仙花 do while
        int num5=100;
        do {
            int  ge=num5%10;
            int shi=num5/10%10;
            int bai=num5/100;
            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==num5){
                System.out.println(num5);
            }
            num5++;
        }while (num5<=999);

        //4.求水仙花  while
        int num6=100;
        while (num6<=999){
            int  ge=num6%10;
            int shi=num6/10%10;
            int bai=num6/100;
            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==num6){
                System.out.println(num6);
            }
            num6++;
        }

    }
}
