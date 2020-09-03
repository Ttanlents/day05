package day22.单例模式.懒汉式;

/**
 * @author 余俊锋
 * @date 2020/9/3 10:04
 */
public class Singleton {
    //懒汉式
    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
