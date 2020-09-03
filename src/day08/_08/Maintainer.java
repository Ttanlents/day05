package day08._08;

public class Maintainer extends  AdminStaff {
    public Maintainer() {
    }

    public Maintainer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("工号"+id+"维护专员"+name+"解决不能共享问题");  ///668
    }

}
