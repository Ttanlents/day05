package day07._03;

public class Test {
    public static void main(String[] args) {
        String str="HellowWorld广州";
        System.out.println("长度："+str.length());
        System.out.println("索引为2的char值"+str.charAt(2));
        System.out.println("字符串o第一次出现在str中的索引位置："+str.indexOf("o"));
        System.out.println("截取字符串str从索引6开始到结束："+str.substring(6));
        System.out.println(" 截取字符串str,从索引2开始到索引7(不包含所以7)"+str.substring(2,7));
    }
}
