package day05;

/**
 *          笔记----------
 * 面向对象：强调的是结果 java是一门面向对象的编程语言
 * 面向过程：强调步骤
 *              三大特征：
 *              封装，继承，多态
 * 类是对象的模板，对象是累的实体
 *  创建对象的格式：
 *    成员变量：1.定义在类中 方法外，这个类都可以使用
 *              2.存在堆内存中
 *              3.有默认值，不赋值也可以使用
 *              4.随着对象的创建而创建，销毁而销毁
 *    局部变量：1.定义在方法中，局部代码块中
 *              2.存在栈内存的方法中
 *              3.没有默认值不可以使用
 *              4.随着方法的调用而存在，随着方法的结束而释放
 *    封装：
 *      1.方法是一种封装
 *      2.private也是一种封装
 *    private关键字：
 *          1.是一个权限修饰符
 *          2.只能在本类中使用，超出范围不能直接访问，可以间接访问
 *
 *类加载机制：https://baijiahao.baidu.com/s?id=1636309817155065432&wfr=spider&for=pc
 */

public class Test01Object {
        //属性--成员变量  和定义变量一样 定义在类中方法外
        //行为--成员方法
    String color;  //手机颜色
    double price;  //手机价格
    String brand;    //手机的品牌

    public void call(){
        System.out.println("这是一个打电话的功能");
    }

    public void photo(){
        System.out.println("这是一个拍照的功能");
    }

    public static void main(String[] args) {
        //创建对象的格式：
        Test01Object phone=new Test01Object();
        phone.color="red";
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);
        phone.call();
        phone.photo();
        Test01Object phone2=new Test01Object();
        System.out.println(phone2.color);
    }

}
