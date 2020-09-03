package day09.test01;

public interface FuImpl extends Fu {

    @Override
    public  void eat();

    @Override
    default void sleep(){
        System.out.println("儿子默认方法");
    }
}
