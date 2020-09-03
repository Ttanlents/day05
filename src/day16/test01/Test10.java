package day16.test01;

/**
 * @author 余俊锋
 * @date 2020/8/26 18:23
 */
public class Test10 {
    public static void main(String[] args) {
        Person person=new Person("潇潇","女");
        new Thread(()->{
            person.setNameAndSex();
        }).start();

        new Thread(()->{
            person.print();
        }).start();
    }
}
