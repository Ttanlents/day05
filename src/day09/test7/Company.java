package day09.test7;



public class Company implements Money {
    int allMoney;

    public Company(int allMoney) {
        this.allMoney = allMoney;
        System.out.println("公司资产为："+this.allMoney);
    }

    @Override
    public void paySalary(Employee e) {
        this.allMoney=this.allMoney-e.getSalary();
        System.out.println("给"+e.getName()+"发工资"+e.getSalary()+"元，公司剩余"+this.allMoney);
    }
}
