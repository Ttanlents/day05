package day06._08;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer,Book> map=new HashMap<>();
        map.put(1,new Book());
       /* Scanner scanner=new Scanner(System.in);
        List<Book> list=new ArrayList();
        Book book1=new Book();
        Book book2=new Book();
        Book book3=new Book();
        list.add(book1);
        list.add(book2);
        list.add(book3);
         for (int i = 0; i < 3; i++) {
            System.out.println("请录入第"+(i+1)+"本书的名称");
            Book book=list.get(i);
            book.setBookName(scanner.nextLine());
            System.out.println("请录入第"+(i+1)+"本书的编码");
             book.setBookNumber(scanner.nextLine());
             System.out.println("请录入第"+(i+1)+"本书的价格");
             book.setBookPrice(scanner.nextDouble() );
             //scanner.nextLine();
         }
         for (Book book:list){
             System.out.println(book.getBookName()+","+book.getBookNumber()+","+book.getBookPrice());
         }
    }*/
        /*List<Book> list=new ArrayList();
        for (int i = 0; i < 3; i++) {
            String bookname=new Scanner(System.in).nextLine();
            String bookNumber=new Scanner(System.in).nextLine();
            double price=new Scanner(System.in).nextDouble();
            list.add(new Book(bookname,bookNumber,price));
        }
    }*/
    }
}
