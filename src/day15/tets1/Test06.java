package day15.tets1;

/**
 * @author 余俊锋
 * @date 2020/8/25 18:33
 */
public class Test06 {
    static int cap=1;
    static int  sum=0;
    public static void main(String[] args) {
        long n=1;
        for (int i = 1; i < 50; i++) {
            n*=i;
        }
        System.out.println((long)n);
        Object object=new Object();
        //实体店
        new Thread(()->{
            int sum1=0;
            while (true){
                synchronized (object){
                    if (cap>=101){
                        break;
                    }
                    sum++;
                    System.out.println("实体店卖出第"+cap+"个"+",剩余："+(100-sum));
                    sum1++;
                    cap++;
                }

            }
            System.out.println("实体店："+sum1);
        }).start();

        //网点
        new Thread(()->{
            int sum2=0;
            while (true){
                synchronized (object){
                    if (cap>=101){
                        break;
                    }
                    sum++;
                    System.out.println("网点店卖出第"+cap+"个"+",剩余："+(100-sum));
                    sum2++;
                    cap++;
                }

            }
            System.out.println("网点："+sum2);
        }).start();
    }
}
