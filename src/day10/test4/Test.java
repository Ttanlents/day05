package day10.test4;

public class Test {


    public static void main(String[] args) {
        Employee work = new Employee();
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");

        Apple bigApple = work.pickApple((a, b) -> {
            System.out.println("默认挑大的：");
            if (a.getSize() > b.getSize()) {
                return a;
            }
            return b;
        }, a1, a2);
        System.out.println(bigApple.getSize()+"--"+bigApple.getColor());
        Apple redApple = work.pickApple((a, b) -> {
            System.out.println("默认红色的：");
            if (a.getColor().equals("红色")) {
                return a;
            }
            return b;
        }, a1, a2);

        System.out.println(bigApple.getSize()+"--"+bigApple.getColor());
    }
}
