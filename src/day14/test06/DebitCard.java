package day14.test06;

public class DebitCard {
    private String accountNummber;
    private Double money;



    public String getAccountNummber() {
        return accountNummber;
    }

    public void setAccountNummber(String accountNummber) {
        this.accountNummber = accountNummber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money<0){
            try {
                throw new MoneyException("余额不能为空");
            } catch (MoneyException e) {
                e.printStackTrace();
            }
        }
            this.money = money;
    }
}
