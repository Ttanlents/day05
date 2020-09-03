package day09.test01;

public class MyImpl implements MyInterface {


    public static void main(String[] args) {
        int a=128;
        short b=-32768;
        new MyImpl().method();
        System.out.println(Math.pow(2,7));//1111 1111
    }
    @Override
    public void method3() {
        System.out.println("从写");
    }
}
