package day16.test01;

/**
 * @author 余俊锋
 * @date 2020/8/26 17:59
 */
public class Test07 {
    public static void main(String[] args) {
        invokeCalc(130,120,(a,b)->a-b);
    }
    public static void invokeCalc(int a,int b,Calculator calculator){
        int result=calculator.calc(a,b);
        System.out.println("结果是："+result);
    }
}
