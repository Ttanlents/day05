package day11.test3_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {

        String date="2016-12-18";
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=dateFormat.parse(date);
        ((SimpleDateFormat) dateFormat).applyPattern("yyyy年MM月dd日");
        System.out.println( dateFormat.format(date1));

    }
}
