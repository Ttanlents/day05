package day11.test1_3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date now=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss sss");
        System.out.println("现在时间："+dateFormat.format(now));
    }
}
