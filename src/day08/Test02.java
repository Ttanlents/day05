package day08;

/**
 *抽象方法的定义格式：
 *  public abstract 返回值类型 方法名（）；
 * 抽象类的定义格式：
 *  public abstract class类名
 *     注意事项：
 *          1.抽象方法所在的类必须是抽象类
 *          2.抽象类不能直接创建对象，必须要用一个子类来继承这个抽象父类
 *          3.子类必须覆盖重写抽象父类的所有抽象方法
 *              覆盖重写：去掉abstract加上方法体
 *          4.抽象方法可以有构造器，但是不能实例化
 */
public abstract class Test02 {
    public static void main(String[] args) {
            //new MyImpl();

    }

    public Test02() {
    }

    public void show(){
        System.out.println("show方法");
    }
}
