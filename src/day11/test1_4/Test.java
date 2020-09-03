package day11.test1_4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = "2020-8-19";
        Date date = dateFormat.parse(birthday);
        System.out.println(date);
    }
}
