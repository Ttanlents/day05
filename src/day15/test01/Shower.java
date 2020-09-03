package day15.test01;

/**
 * @author 余俊锋
 * @date 2020/8/25 16:30
 */
public class Shower {
    public void show1(){
        synchronized (this){
            System.out.print("犯");
            System.out.print("我");
            System.out.print("德");
            System.out.print("邦");
            System.out.print("者");
            System.out.println();
        }

    }
    public void show2(){
        synchronized (this){
            System.out.print("虽");
            System.out.print("远");
            System.out.print("必");
            System.out.print("诛");
            System.out.println();
        }

    }

}
