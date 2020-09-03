package day07;

/**
 * 内容比较：
 *      1.String 中的public boolean equals(Object anObject)方法
 *      2."".equalsIgnoreCase() 忽略大小写。
 *    建议调用方法格式：
 *              “xxx”.equals();
 */

public class Test02 {


    public static void main(String[] args) {
      String a="abc";
      String b="abc";
      String c="ABC";
      StringBuilder sb=new StringBuilder("abc");
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(b.equalsIgnoreCase(c));
        System.out.println(a.contentEquals(sb));
    }
}
