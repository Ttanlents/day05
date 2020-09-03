package day22.单例模式.饿汉式;

/**
 * @author 余俊锋
 * @date 2020/9/3 10:20
 */
public class Test {
    public static void main(String[] args) {
        Singleton instance =Singleton.getInstance();
        System.out.println(instance);
        instance=new Singleton();
        System.out.println(instance);
        System.out.println(Singleton.getInstance());
    }
}
