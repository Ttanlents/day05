package day06._07;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Worker worker1=new Worker("bz001","黄渤",45);
        Worker worker2=new Worker("bz001","孙红雷",48);
        Worker worker3=new Worker("bz001","罗志祥",35);
        List<Worker> list=new ArrayList<>();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);

        findMaxAge(list);
    }

    public static void findMaxAge(List<Worker> list){
        Worker maxAge=list.get(0);
        for (Worker worker:list){
            if (worker.getAge()>maxAge.getAge()){
                maxAge=worker;
            }
        }
       maxAge.show();
    }
}
