package day04;

/**
 * 方法：小驼峰命名
 * 三种调用方式：
 *  1.直接调用
 *  2.输出调用
 *  3.赋值调用
 *  权限修饰符： public static
 *  返回值类型：固定写法 void int String ....  manage
 */

public class TestFunction01 {

    public static void main(String[] args) {
        System.out.println(getSum(5,5,3,3));
        System.out.println(sum());
        sum();
        print(5);

    }

    public static   int getSum(int ...a){
        int sum=0;
        for (int i:a){
            sum+=i;
        }
       return  sum;
    }



    /**
     * 比较两个数
     * @param a
     * @param b
     * @return
     */
    public  static boolean compare(int a,int b){
        return a==b?true:false;
    }

    /**
     * 累加1-100
     * @return
     */
    public static int sum(){
        int sum=0;
        for (int i = 0; i <101 ; i++) {
            sum+=i;
        }
        return sum;
    }

    /**
     * 指定打印helllowWorld次数
     * @param count
     */
    public  static void print(int count){
        for (int i = 0; i < count; i++) {
            System.out.println("hellowWorld");
        }
    }



}
