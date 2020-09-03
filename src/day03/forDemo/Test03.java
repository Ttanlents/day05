package day03.forDemo;

/**
 * 面试题
 */
public class Test03 {
    public static void main(String[] args) {
          //第一天
        //1.以下代码结果是： a b c b c bc
        int x=1;
        for (System.out.println("a");x<=3; System.out.println("c") ){
            System.out.println("b");
            x++;
        }

        //2.以下代码a的结果：1 面试题
      int a=1;
        for (int i = 0; i <100 ; i++) {
            a=a++;
        }
        System.out.println(a);

        //第二天
        //3.b的结果是：1
        int b=0;
       test01(b);
       b++;
        System.out.println(b);


        //4.b的结果是：0
         b=0;
        test01(b);
        b=b++;
        System.out.println(b);

        //5.c的结果是：
        double c=1.0/0; //infinity
        System.out.println(c);
        //因为0会向上转型变成无穷小，任何一个数初一无穷小都会变成无穷大


        //6.ECMAScript和JavaScript有什么关系？
        //ECMAScript所有脚本语言的标准
        //javascript是满足ecmascript的脚本语言

        //7.jq对象和js对象的转换？
        //8.jq的ready和 js的onload有什么区别
    }
    public static  void test01(int b){
        b++;
    }
}
