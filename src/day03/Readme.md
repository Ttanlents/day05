***day03--笔记本***
* switch
 *          固定值  case比较
 *          执行相应的语句体
 *          break;
 *          case穿透性，当匹配的case后面没有break,都会执行下一个语句体，直到遇到break
 *
 *          + = 自带强转特点
 
 * 三元表达式的互换
 *      条件表达式：语句体1：语句体2
 
 * for结构（初始化语句；条件表达式；步进语句）{
 *     循环体
 * }
 * 流程1.执行初始化语句
 *      2.条件表达式
 *      3.循环体
 *      4.步进语句
 *      true 循环执行 234  234   234
 *      false 循环结束
 
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
 
 * break 结束循环  结束switch语句
 * continue  跳出本次循环  继续下一次循环
 
 
 package day03.forDemo;

/**
 * 面试题
 */
public class Test03 {
    public static void main(String[] args) {
          //第一天   a  b    c  b  c  b   c
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
