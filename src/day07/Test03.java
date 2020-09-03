package day07;

/**
 * String 中常用的方法：
 *  length(); 返回长度
 *  concat();拼接字符串；
 *  charAt();定位内容
 *  indexof();定位下标
 *  substring();返回一个字符串，从beginIndex 到endIndex 截取字符串，左闭右开
 *      不包含endindex
 *
 *      字符串索引越界异常。String.lang.StringindexBounds
 *
 */

public class Test03 {
    public static void main(String[] args) {
        String str="hellowWorld";
        System.out.println(str.length());

        String concat=str.concat("!!");

        System.out.println(concat);

        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("o",4));//左闭 从那个位置开始
    }
}
