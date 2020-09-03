package day09.test01;

import day09.test01.Fu;

/**
 * 子类需要重写父接口中的抽象方法。如果不重写，则必须声明成抽象类
 */
public  class Zi implements Fu {


    @Override
    public void eat() {
        System.out.println("儿子吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("儿子睡觉");
    }
}
