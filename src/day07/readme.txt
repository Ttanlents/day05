**day07  ---笔记本**
***一.String类***

 * java.lang,String
 * String类代表常量字符串，java程序中的所有字符串字面值（"abc"）都作为该类实例实现
 *      所有用引号起来的都是String 对象
 *      特点：
 *      1.字符串是常量，他们的值在创建之后不能更改
 *      2.因为String对象是不可变的，所以可以共享
 *
 *     构造方法：
 *    String() 创建一个空字符串
 *    String(String original) 根据字符串创建
 *    String(char[] value) 根据字符数组创建
 *    String(byte[] bytes) 通过字节数组来构造新的字符串对象
 *    String(byte[] bytes,int off,int length) 根据字节数组的一部分构造新的字符串
 *
 *    注意事项：基本数据类型比较的是内容，引用类型比较的是地址值
 *              1.拼接字符串会生成一个新的String对象

   ** 二.equals()方法。***

 * 内容比较：
 *      1.String 中的public boolean equals(Object anObject)方法
 *      2."".equalsIgnoreCase() 忽略大小写。
 *    建议调用方法格式：
 *              “xxx”.equals();

*** 三.常用方法***
 * String 中常用的方法：
 *  length(); 返回长度
 *  concat();拼接字符串；
 *  charAt();定位内容
 *  indexof();定位下标
 *  substring();返回一个字符串，从beginIndex 到endIndex 截取字符串，左闭右开
 *      不包含endindex
 *
    * 转换功能的方法：
 *      public char[] toCharArray()将此字符串转换为新的字符数组
 *      public getbytes(); 使用平台默认的字符集，将字符串转化为新的字节数组
 *      tolowerCase(); 使用默认的语言环境的规则，将String转化为小写
 *      toUpperCase();转化为大写，使用默认的语言环境规则。
 *      replace(CharSequence target,CharSequence replacement)将所有字目标String字符串的，转化为指定的字符串
 *      split(",");将字符串分割为字符串数组

 * 常量池在1.7版本后 都是在 jvm堆内存中

 四.Static关键字学习
* static 关键字：静态
 *  可以修饰成员变量和成员方法，一旦用static修饰后的成员变量和成员方法就只属于类
 *      static修饰的成员变量叫做静态变量。
 *      static修饰的成员方法叫做静态方法。
 *      访问静态变量和静态方法格式：
 *          对象名.静态变量/静态方法 不推荐  jvm本质还是用类名调
 *          类名.静态变量/静态方法
 *      特点：
 *       1.静态不可以访问非静态
 *       2.静态中不能使用this this代表对象（谁调用代表谁） 静态优先于所有对象
 *    静态代码块：
 *      static{
 *
 *      }
 *      特点：
 *          1.类里面，但是在方法之外
 *          2.优先于构造器
 *          3.类初始化时只执行一次
 *
 * new 一个子类对象是，类加载顺序。
 *      1.父类静态代码块
 *      2.子类静态
 *      3.父类构造器
 *      4.子类构造器