package day22.单例模式.懒汉式;

/**
 * @author 余俊锋
 * @date 2020/9/3 10:33
 */
public class Singleton2 {
    //懒汉式 改进版double check
    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance!=null){
            return instance;
        }
        synchronized (Singleton2.class){
            if (instance!=null){
                return instance;
            }
            instance=new Singleton();
            return instance;
        }
    }
}
