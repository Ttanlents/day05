package day16.test01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/8/27 9:49
 */
public class Number {
    List<Integer> list;
    int count;

    public Number() {
        this.list=new ArrayList<>();
        this.count=0;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
