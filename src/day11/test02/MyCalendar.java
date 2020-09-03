package day11.test02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar calendar=new GregorianCalendar();
        System.out.println(calendar.getTime());
        Date date=calendar.getTime();
        System.out.println(date);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH)-1);
        calendar.set(2020,9,19,15,46,30);
        System.out.println(calendar.getTime());
        Character c=  'a';
        c.charValue();
    }
}
