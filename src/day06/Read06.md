 day06 ***笔记本*** 
一. 学习一个类分为三步： 
    1.导包  java.lang包下的类
    2.学习构造方法 创建对象
    3.学习成员方法
   
java.util.Scanner包下是一个可以使用正则表达式来解析基本类型和字符串的简单文本扫描器
**构造方法：**
Scanner(inputStream source)构造一个新的Scanner             
inputStream source固定写法--》系统输入System.in 通过键盘录入数据。
 Scanner sc=   new Scanner(System.in);
**成员方法：**
        1.next() 获取键盘输入的信息 输入信息后所有空格、tab、enter、 都视为结束符号
        2.nextInt() 获取整数。
        3.nextLine() 获取键盘输入的信息 可以保留空格 enter键结束
        
二.匿名对象
    当这个对象在本类中只使用一次时，推荐写匿名对象。
    
三.Random 随机数生成器
 *  int RandomInt  返回一个伪随机数 左闭右开  100   就是0-99  new Random().nextInt();

四.java.util.Arraylist<E>集合
    特点;1.大小可变的数组的实现
           2.<E>(泛型)：当前集合中存放的统一的都是什么类型的。泛型只能是引用类型
            3.直接打印集合，不是地址值。
            4.创建集合时，右侧的<>里面的泛型在1.7后可以省略
     构造方法：
        1.无参构造是初始容量为10的空列表
      成员方法;
            1.boolean add(E e)将指定的元素添加到此列表的尾部。
            2.E remove(int index)移除列表中指定位置上的元素。返回删除的元素
            3.E get(int index)返回指定下标 的元素
            4.int size() 返回此列表中的元素数。
     * 基本数据类型不能作为泛型使用：
            想要在集合中存储基本数据类型，泛型为基本数据类型的包装类（将一个基本数据类型包装成一个引用类型）
            //int --Integer   char--Chararter
            