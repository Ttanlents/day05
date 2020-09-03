package day22.Enum;

/**
 * @author 余俊锋
 * @date 2020/9/3 11:30
 *
 * 枚举：
 *    1. 构造器没有修饰符
 *    2. 枚举用逗号隔开，最用用分号，每一个枚举项都是实例对象
 *    3.使用方法  类.枚举项  + .name()或者 .value()
 *    4.不能被抽象修饰，可以有抽象方法，枚举项要重写该抽象方法
 *
 *      常用方法：
 *      `static Direction[] values()`：返回本类所有枚举常量；
 *       static Direction valueOf(String name)`：通过枚举常量的名字返回
 */
public class Test {
    public static void main(String[] args) {
      String name=  DirectionEnum.FRONT.name();
    }
}
