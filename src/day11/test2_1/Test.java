package day11.test2_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String mydate="1996-06-12";
        long myDateTime= 0;
        try {
            myDateTime = format.parse(mydate).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long birthTime=new Date().getTime();
        long day=(birthTime-myDateTime)/(1000*60*60*24);
        long day2=(birthTime-myDateTime)/(1000*60*60);
        int year=(int)day/365;
        int month=(int)(day/30)%12;
        int myday=(int)(day%30);
        int hour=(int)day2%24;
        System.out.println("活了："+year+"年"+month+"月"+myday+"天"+hour+"小时");
    }
}
