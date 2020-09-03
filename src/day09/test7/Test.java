package day09.test7;

public class Test {
    public static void main(String[] args) {
        Employee manager=new Manager("张小强",9000);
        Employee coder=new Coder("李小亮",5000);
        Money company=new Company(1000000);
        company.paySalary(manager);
        company.paySalary(manager);
    }

}
