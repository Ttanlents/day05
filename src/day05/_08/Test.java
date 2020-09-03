package day05._08;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        String mydate="";
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        mydate="2017-01-01";
        Date date= dateFormat.parse(mydate);
        Book book=new Book("No0003","javaWeb","isbn387648797524",58.8,date);
        Book book1=new Book("No0003","javaWeb","isbn387648797524",69.8,date);
        Book book2=new Book("No0003","javaWeb","isbn387648797524",99.8,date);
        List<Book> list=new ArrayList<>();
        list.add(book);
        list.add(book1);
        list.add(book2);
        Book theBook=book;
        for (Book b:list){
            if (theBook.getPrice()<b.getPrice()){
                theBook=b;
            }
        }
        theBook.showBook();
    }
}
