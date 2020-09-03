package day07;

import java.util.Arrays;

/**
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
 */

public class Test01 {
    public static void main(String[] args) {
       String str1="";
        System.out.println(str1);

        String str2="你好吗";
        System.out.println("第二个字符串："+str2);

        char[] chs={'a','b','c'};
        String str3=new String(chs);
        System.out.println(str3);

        String str4=new String(chs,0,2);


        byte[] bytes="97".getBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes);
        String str5=new String(bytes);
        System.out.println(str5);

        Integer a=127; //-128-127缓存区
        Integer b=Integer.valueOf(127);
        System.out.println(a==b);
        System.out.println(123);


    }
}
