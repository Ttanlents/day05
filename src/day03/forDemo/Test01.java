package day03.forDemo;

/**
 * for结构（初始化语句；条件表达式；步进语句）{
 *     循环体
 * }
 * 流程1.执行初始化语句
 *      2.条件表达式
 *      3.循环体
 *      4.步进语句
 *      true 循环执行 234  234   234
 *      false 循环结束
 *
 *
 */

public class Test01 {
    public static void main(String[] args) {
        for (int count=1;count<=10;count++){
            System.out.println("循环"+count+"次");
        }
        // 97  122  小写26个字母
        for (int num=97;num<122;num++){
            System.out.print((char)num+" ");
            //强制转换类型 变量名=（小的数据类型）大的数据类型
        }
        System.out.println();

        //求1-5之间的和
        int sum=0;
        for (int num=0;num<=5;num++){
            sum+=num;
        }
        System.out.println(sum);

    }
}
