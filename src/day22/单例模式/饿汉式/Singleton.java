package day22.单例模式.饿汉式;

/**
 * @author 余俊锋
 * @date 2020/9/3 10:02
 */
public class Singleton {
    //饿汉式一
    private  static   Singleton instance=new Singleton();

    public static   Singleton getInstance(){
        return  instance;
    }
}
