package day07;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 转换功能的方法：
 * public char[] toCharArray()将此字符串转换为新的字符数组
 * public getbytes(); 使用平台默认的字符集，将字符串转化为新的字节数组
 * tolowerCase(); 使用默认的语言环境的规则，将String转化为小写
 * toUpperCase();转化为大写，使用默认的语言环境规则。
 * replace(CharSequence target,CharSequence replacement)将所有字目标String字符串的，转化为指定的字符串
 */

public class Test04 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "abcda中a";
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }
        System.out.println();
        byte[] bb = str.getBytes();  //默认使用 iso-8859-1
        for (int i = 0; i < bb.length; i++) {
            System.out.print(bb[i] + " ");
        }

        System.out.println(str.replace('a', 'b'));
        System.out.println(str);
        System.out.println(str.replace("a", "中"));


        String str2 = new String("h,e,l,l,o,w");
        String str3[] = str2.split(",");
        System.out.println(Arrays.toString(str3));

    }
}

