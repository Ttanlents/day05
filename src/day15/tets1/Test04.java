package day15.tets1;

/**
 * @author 余俊锋
 * @date 2020/8/25 18:09
 */
public class Test04 {
    public static void main(String[] args) {
        new Thread(()->{
            while (true){
                System.out.println("播放背景音乐");
            }
        }).start();
        new Thread(()->{
            while (true){
                System.out.println("显示方面");
            }
        }).start();
    }
}
