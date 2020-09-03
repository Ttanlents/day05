package day09.test8;

public class Test {
    public static void main(String[] args) {
        ShopCar car=new ShopCar();
        System.out.println("=======添加商品=============");
        car.addGoods(new EGoods("g20000","苹果",50.0));
        car.addGoods(new Phone("g10001","手机",5000.0));
        car.addGoods(new Laptop("g10000","",10000));
        System.out.println("=======打印商品=============");
        car.showGoods();
        car.getTotal();
    }
}
