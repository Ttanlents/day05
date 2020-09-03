package day03.forDemo;

/**
 * for扩展
 *  嵌套循环
 */

public class ExtendFor {
    public static void main(String[] args) {
        //扩展写法
        for (int i = 0, j=0 ;i < j; i++,j++) {

        }
        //1.直角三角形
        for (int i = 0; i <5 ; i++) {
            System.out.println();
            for (int j = 0; j <=i; j++) {
                System.out.print("☆");
            }
        }
        System.out.println();
        //2.倒三角
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 5; j >i ; j--) {
                System.out.print("☆");
            }
        }

        //3.等腰三角形
        System.out.println();
            for(int x=0;x<5;x++) {
                for(int y=0;y<5-x-1;y++) {
                    System.out.print(" ");  //四个空格   三个空格
                }
                for(int z=0;z<=x;z++) {
                    System.out.print("☆");  //一个星星   2个星星
                }
                System.out.println();

        }


        //break和continue 后加标记
        //if 单个分支 如果大括号内只有一条语句 大括号可以省略省略
      test01:for (int i = 1; i <=3 ; i++) {
           test02:for (int j = 1; j <=3 ; j++) {
                System.out.print(i+"-"+j+" ");
                if (i==2&&j==2){
                   // break test01;
                    System.out.println();
                    continue test01;
                }
            }
            System.out.println();
        }
    }
}
