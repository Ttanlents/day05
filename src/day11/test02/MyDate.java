package day11.test02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 时间 1970作为元年
 *      工具类dateForm : String 和 date相互装换
 *          yyyy-MM-dd (月份是大写，分钟是小写)
 *          HH-mm-dd  (HH是24小时制，hh是12小时制)
 */

public class MyDate {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);
        date=new Date(1000);
        System.out.println(date.getTime());
        DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String mydate="1995-08-19";
        long myDateTime=format.parse(mydate).getTime();
        long birthTime=new Date().getTime();
        long day=(birthTime-myDateTime)/(1000*60*60*24);
        long day2=(birthTime-myDateTime)/(1000*60*60);
        int year=(int)day/365;
        int month=(int)(day/30)%12;
        int myday=(int)(day%30);
        int hour=(int)day2%24;
        System.out.println("活了："+year+"年"+month+"月"+myday+"天"+hour+"小时");
        Calendar calendar=new GregorianCalendar();
        System.out.println(50*365*24*60*60*1000l);


    }
}
