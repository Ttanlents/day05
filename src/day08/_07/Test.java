package day08._07;



public class Test {
    public static void main(String[] args) {
        Manger manager=new Manger("123456","老王",30);
        Chef chef=new Chef("9527","老王",300);
        manager.eat();
        manager.work();
        chef.eat();
        chef.work();
    }
}
