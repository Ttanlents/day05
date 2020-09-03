package day07._04;

public class Test {
    public static void main(String[] args) {
        String str="HelloWorld";
        System.out.println(" 将str字符串转换为字符数组,并遍历字符数组,输出每个字符");
        char[] a=str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(" 将str字符串转换为小写"+str.toLowerCase());
        System.out.println("将str字符串转换为大"+str.toUpperCase());
        System.out.println(" 将str字符串中的字符'o'替换成'6'"+str.replace("o","6"));
        System.out.println(" 将str字符串中的字符串\"ll\"替换成\"LL\""+str.replace("ll","LL"));
    }
}
