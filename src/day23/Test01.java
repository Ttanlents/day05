package day23;

/**
 * @author 余俊锋
 * @date 2020/9/3 15:29
 */
public class Test01 {

    public static void main(String[] args) {
        System.out.println(getSum(5));
    }

    public static int getSum(int num){
        if (num<=1){
            return 1;
        }
        return num*getSum(num-1);
    }
}
