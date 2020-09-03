package day07._09;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("apples");
        list.add("banners");
        list.add("waters");
        list.add("abc");
        System.out.println("源" + list);
//        for (String str:list){
//            if (str.length()>4){
//               list1.add(str);
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > 4) {
                list.remove(list.get(i));
                i--;
            }

        }
        /* System.out.println(list1);*/
        /* list.removeAll(list1);*/
        System.out.println("删除后：" + list);
    }
}
