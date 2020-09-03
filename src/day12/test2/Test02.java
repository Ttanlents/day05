package day12.test2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Person> list= new ArrayList<>();
        list.add(new Person("张三",18,1.80));
        list.add(new Person("李四",18,1.60));
        list.add(new Person("王五",18,1.7));
        list.add(new Person("赵六",18,1.75));
        list.add(new Person("王麻子",18,1.72));
        double minTall=list.get(0).getTall();
        double maxTall=list.get(0).getTall();
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            double tall=person.getTall();
            if (tall>maxTall){
                maxTall=tall;
            }
            if (tall<minTall){
                minTall=tall;
            }
        }
        System.out.println("最高身高"+maxTall+"最低身高："+minTall);
    }
}
