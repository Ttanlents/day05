package day11.test3_2;

public class shopCar {
   private Product product;
   private int count;
   private double totalPrice;

    public shopCar() {
    }

    public shopCar(Product product, int count, double totalPrice) {
        this.product = product;
        this.count = count;
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }



    @Override
    public String toString() {
        return "shopCar{" +
                "product=" + product +
                ", count=" + count +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
