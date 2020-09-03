***day11-笔记本***
 一.Stream流
 *     成员方法，返回值都是this：
 *      1.foreach+Lambda表达式 遍历
 *      2.collectors 转化为集合
 *      3.filter 过路器+过滤条件
 *      4.limit 截取限制 取 几个
 *      5.skip 跳过steam中前2个元素
 *      6.静态方法： concat 合并两个Stream流
 *      7.distinct 去重
 *  包装类：valueOF() 装箱  parsexxx(String a)拆箱
 
 二. Object
 * 1.== 基本类型比较的是内容  引用类型比较内存地址
 * 2.equals 不重写比较的是内存地址，重写比较的是内容
 *             Objects类
 *      （1）高级用法Objects.equals(s3,s1)
 * 3.hashcode()
 *        (1)hashcode不同，内容一定不同
 *        （2）hashcode相同，内容不一定相同
 
 三.Date时间类
 时间 1970作为元年
 *      工具类dateForm : String 和 date相互装换
 *          yyyy-MM-dd (月份是大写，分钟是小写)
 *          HH-mm-dd  (HH是24小时制，hh是12小时制)
 
 四、包装类
 1.请说出基本数据类型对应的八个包装类分别是什么？
byte Byte
short Short
int Integer
long Long
float Float
double Double
char Character
boolean Boolean
2.请说出如何把字符串装换为对应的基本数据类型，有什么主意点？
    除了Character类，其他七个包装类都可以
    调用包装类型相应的parseXXX 静态方法将字符串参数装换为基本的数据类型

3.请说出自动拆箱和自动装箱的理解
    自动装箱本质上是调用包装类的静态方法 valueOf(),进行装箱
    自动拆箱本质上是调用包装对象的xxxValue(),进行拆箱
    由编译器自动完成
 