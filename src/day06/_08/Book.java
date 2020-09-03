package day06._08;

public class Book {
    private String bookName;
    private String bookNumber;
    private double bookPrice;

    public Book(String bookName, String bookNumber, double bookPrice) {
        this.bookName = bookName;
        this.bookNumber = bookNumber;
        this.bookPrice = bookPrice;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookNumber='" + bookNumber + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
