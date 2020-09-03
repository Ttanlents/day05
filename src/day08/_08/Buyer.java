package day08._08;

public class Buyer extends AdminStaff {
    public Buyer() {
    }

    public Buyer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号"+id+"维护专员"+name+"在采购设备");  ///668
    }
}
