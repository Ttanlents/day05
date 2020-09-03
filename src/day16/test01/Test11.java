package day16.test01;

/**
 * @author 余俊锋
 * @date 2020/8/26 19:11
 */
public class Test11 {
    public static void main(String[] args) {
        Meeting m1=new Meeting();
        Meeting m2=new Meeting();
        new Thread(()->{
            m1.front();
        }).start();
        new Thread(()->{
           m1.behind();
        }).start();


    }
}

class Meeting extends Thread{
     int num=100;





    public void  front(){
        int sum=0;
        while (true){
            synchronized (this){

                if (num>0){
                    System.out.println("编号为："+(101-num)+"从前门入场，拿到的双色球彩票号码是:"+DoubleColorBallUtil.create());
                    sum++;
                    num--;
                }else {
                    System.out.println("前门总人数："+sum);
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }

    public void behind(){
        int sum=0;
        while (true){
            synchronized (this){
                if (num>0){
                    System.out.println("编号为："+(101-num)+"从后门入场，拿到的双色球彩票号码是:"+DoubleColorBallUtil.create());
                    sum++;
                    num--;
                }else {
                    System.out.println("后门人数："+sum);
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}

