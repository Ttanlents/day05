package day10;

class Person {
    public static void main(String[] args) {
            new Person().eat();
    }
    private String name = "凤姐";

    public void eat() {
        //筷子
        class Chopsticks {
            private int length;

            public void use() { //使用外部类变量
                System.out.println(name + "在使用长为" + length + "的筷子吃饭");
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }
        }

        Chopsticks c = new Chopsticks();
        c.setLength(50);
        c.use();
    }
}
