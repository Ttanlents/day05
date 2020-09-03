package day08._04;

public class C extends B {
    int numc=30;

    @Override
    public void showB() {
        System.out.println("B类中"+numb);
    }

    @Override
    public void showA() {
        System.out.println("A类中"+numa);
    }

    public void shopC(){
        System.out.println("C类中"+numc);
    }
}
