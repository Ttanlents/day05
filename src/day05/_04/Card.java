package day05._04;

public class Card {



    private String color;
    private String count;

    public Card() {
    }

    public Card(String color, String count) {
        this.color = color;
        this.count = count;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public void showcard(){
        System.out.println(this.color+this.count);
    }
}
