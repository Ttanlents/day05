package day03.Break;

/**
 * break 结束循环  结束switch语句
 * continue  跳出本次循环  继续下一次循环
 */

public class Test01 {
    public static void main(String[] args) {
        //1-5层  到底三层下电梯   4  5没人按  电梯停在3层
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("停在第三层");
                break;
            }
            System.out.println("第" + i + "层到了");
        }

        //第四层没人下
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("第" + i + "层到了");
        }

        //1.求1-100之间的和，除了3的倍数
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

        //2.
        // 输出10-20之间的数，遇到个位数为3得数则停止输出
        for (int i = 10; i < 20; i++) {
            if (i%10==3){
                break;
            }
            System.out.println(i);
        }
    }
}
