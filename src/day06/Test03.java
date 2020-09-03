package day06;

import java.util.Random;
import java.util.Scanner;

/**
 * Random 随机数生成器
 *  int RandomInt  返回一个伪随机数 左闭右开  100   就是0-99
 *
 *  猜数字小游戏：
 *      1.生成一个1-100之间的随机数  匿名对象
 *      2.创建Scanner对象  调用nextint()  获取用户输入的数字
 *      3.while(true) 死循环  猜n次
 *      4.随机数和用户输入数比较
 */

public class Test03 {
    public static void main(String[] args) {
      int randomNum=  new Random().nextInt(101);
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入1-100之间的数字");
            int userNum=scanner.nextInt();
            if (userNum>randomNum){
                System.out.println("输入的数字大了！");
            }
            if (userNum<randomNum){
                System.out.println("输入的数字小了！");
            }else {
                System.out.println("恭喜猜对了");
            }
        }
    }
}
