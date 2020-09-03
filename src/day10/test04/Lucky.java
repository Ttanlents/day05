package day10.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lucky implements OpenModel {
    @Override
    public List<Integer> sendRedPack(int money, int count) {
        List<Integer> list=new ArrayList<>();
        int num=count;
        Random random=new Random();
        for (int i = 0; i < num-1; i++) {   //0-9
            int luckyMoney=random.nextInt(money/count*2-1)+1;
            list.add(luckyMoney);
            money-=luckyMoney;
            count--;
        }
        list.add(money);
      return   list;
    }
}
