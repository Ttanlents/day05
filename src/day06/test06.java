package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(101));
        }
        System.out.println(list);
        System.out.println(printList(list));

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(scanner.nextLine());
        }
    }

    /**
     * 自定义打印格式
     * @param list
     * @return
     */
    public static String printList(List list){
        StringBuilder sb=new StringBuilder();
        sb.append("{");
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1){
                sb.append(list.get(i)+"}");
                break;
            }
            sb.append(list.get(i)+"· ");
        }
        return sb.toString();
    }
}
