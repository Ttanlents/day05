package day13.test02;

import day13.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class listUtils<E> {

    public static List<User> add(User ...obj){
        ArrayList<User> objects = new ArrayList<>();
        for (User o : obj) {
            objects.add(o);
        }
        return objects;
    }

    public   List<E> addList(E ...obj){
        ArrayList<E> objects = new ArrayList<>();
        for (E o : obj) {
            objects.add(o);
        }
        return objects;
    }

    public Set<E> addSet(E ...obj){
        Set<E> objects = new HashSet<>();
        for (E o : obj) {
            objects.add(o);
        }
        return objects;
    }




}
