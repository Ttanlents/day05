package day05._07;

import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    int year;
    int  month;
    int day;


    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate(){
        System.out.println("日期："+year+"年"+month+"月"+day+"日");
    }

    public void isBi(MyDate date){
        int year=date.getYear();
        if (year%100==0&&year%400==0||year%100!=0&&year%4==0){
            System.out.println(year+"是闰年");
            return;
        }
        System.out.println(year+"不是闰年");
    }
}
