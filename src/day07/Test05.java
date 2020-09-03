package day07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 键盘录入一个字符，统计字符串中的每一个字符的，大小写字母以及数字字符的个数
 * 1.创建Scanner 对象 调用next方法
 * 2.定义四个变量记录大小写，数字，其他字符出现的次数
 * 3.遍历字符串，判断字符串中大写，小写，数字，其他
 * 4.对应的字数+1
 */

public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String content = reader.readLine();
        System.out.println(content.length());
        char ch[]=content.toCharArray();
        int smallChar=0;
        int bigChar=0;
        int number=0;
        int otherChar=0;
        System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            char a=ch[i];
            if (a>='a'&&a<='z'){
                smallChar++;
                continue;
            }
            if (a>='A'&&a<='Z'){
                bigChar++;
                continue;
            }
            if (a<='9'&&a>='0'){
                number++;
                continue;
            }
            otherChar++;

        }
        System.out.println("数字："+number);
        System.out.println("大写字母："+bigChar);
        System.out.println("小写字母"+smallChar);
        System.out.println("其他字符："+otherChar);
    }
}
