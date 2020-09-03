package day11.test2_2;

public class Test {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        String str="";
        for (int i = 0; i < 10000; i++) {
            str+="hello";
        }
        long end=System.currentTimeMillis();
        System.out.println("string花费时间"+(end-start));

       start=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("hello");
        }
        end=System.currentTimeMillis();
        System.out.println("stringbuild花费时间"+(end-start));
    }
}
