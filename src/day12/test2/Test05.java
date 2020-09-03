package day12.test2;

import java.util.ArrayList;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 18, 1.80));
        list.add(new Person("李四", 18, 1.60));
        list.add(new Person("王五", 18, 1.7));
        list.add(new Person("赵六", 18, 1.75));
        list.add(new Person("王麻子", 18, 1.72));

        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            person.setAge(person.getAge() + 2);
        }

        for (Person person : list) {
            System.out.println(person);
        }
    }
}
