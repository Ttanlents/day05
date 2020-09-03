package day15.tets1;

/**
 * @author 余俊锋
 * @date 2020/8/25 18:04
 */
public class Test03 extends Thread {
    public static void main(String[] args) {
        A a=new A();
        a.start();
        B b=new B();
        new Thread(b).start();
    }

}

class A extends Thread{
    @Override
    public void run() {
        System.out.println("继承thread");
    }
}

class B implements Runnable{

    @Override
    public void run() {
        System.out.println("实现Runable");
    }
}
