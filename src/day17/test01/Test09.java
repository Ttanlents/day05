package day17.test01;

/**
 * @author 余俊锋
 * @date 2020/8/27 17:04
 */
public class Test09 {
    public static void main(String[] args) {
        System.out.println(getSum(150));
    }

    public static int getSum(int a){

        if (a<=1){
            return 1;
        }
        return a+getSum(a-1);
    }
}
