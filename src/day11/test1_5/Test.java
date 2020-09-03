package day11.test1_5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, 500);
        long year=calendar.get(Calendar.YEAR);
        long month=calendar.get(Calendar.MONTH)+1;
        long day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
