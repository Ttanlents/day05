package day13;

import java.util.ArrayList;
import java.util.List;

public class listUtils<E> {
    public static List<User> add(User ...obj){
        ArrayList<User> objects = new ArrayList<>();
        for (User o : obj) {
            objects.add(o);
        }
        return objects;
    }

    public  List<E> add(E ...obj){
        ArrayList<E> objects = new ArrayList<>();
        for (E o : obj) {
            objects.add(o);
        }
        return objects;
    }
}
