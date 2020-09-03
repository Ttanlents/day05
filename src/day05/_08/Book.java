package day05._08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    String bookNumber;
    String bookNme;
    String isbnNumber;
    Double price;
    Date date;

    public Book() {
    }

    public Book(String bookNumber, String bookNme, String isbnNumber, Double price, Date date) {
        this.bookNumber = bookNumber;
        this.bookNme = bookNme;
        this.isbnNumber = isbnNumber;
        this.price = price;
        this.date = date;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookNme() {
        return bookNme;
    }

    public void setBookNme(String bookNme) {
        this.bookNme = bookNme;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

     public void showBook(){
         DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");

         System.out.println("最贵的书是："+bookNumber+","+bookNme+","+isbnNumber+","+price+","+dateFormat.format(date));
     }
}
