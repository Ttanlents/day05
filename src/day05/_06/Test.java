package day05._06;

public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.setName("James");
        manager.setNumber(9527);
        manager.setReward(3000);
        manager.setSalary(15000);
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("===========");
        Coder coder=new Coder("Kobe","0025",10000);
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
