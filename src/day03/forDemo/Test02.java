package day03.forDemo;

/**
 * 1.求1-100的和
 * 2.求1-100之间的偶数和    奇数和
 * 3.求8的阶乘
 * 4.求水仙花数  最高三位的个十百的3次方相加  还是等于这个数
 */

public class Test02 {
    public static void main(String[] args) {
        //1.求1-100的和
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println(sum);

        //2.求1-100之间的偶数和    奇数和
        int sum1=0;
        int sum2=0;
        for (int i=1;i<=100;i++){
           if (i%2==0){
               sum1+=i;
           }else {
               sum2+=i;
           }
        }
        System.out.println(sum1);
        System.out.println(sum2);

        // 3.求8的阶乘
        int sum3=1;
        for (int i=1;i<=8;i++){
            sum3*=i;
        }
        System.out.println(sum3);

        //4.求水仙花数  最高三位的个十百的3次方相加  还是等于这个数

        for (int i=100;i<=9999;i++){
           String numm=String.valueOf(i);
           String arr[]=numm.split("");
           double target=Math.pow((double) Integer.parseInt(arr[0]),3)+Math.pow((double) Integer.parseInt(arr[1]),3)+Math.pow((double) Integer.parseInt(arr[2]),3);
          if (target==i){
              System.out.println("水鲜花"+i);
          }

        }

    }


}
