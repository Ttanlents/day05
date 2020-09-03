package day10.test04;

import java.util.ArrayList;
import java.util.List;

public class Common implements OpenModel{
    @Override
    public List<Integer> sendRedPack(int money,int count) {
        List<Integer> list=new ArrayList<>();
        int tempMoney=money/count;
        for (int i = 0; i < count-1; i++) {
            list.add(tempMoney);
            money-=tempMoney;
        }
        list.add(money);
        return list;
    }
}
