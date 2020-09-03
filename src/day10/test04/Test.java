package day10.test04;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        RedPack redPack=new RedPack();
        redPack.setOpenModel(new Lucky());
     //List<Integer> list= redPack.getOpenModel().sendRedPack(10,5);
        for (int i = 0; i < 50; i++) {
            List<Integer> list= redPack.getOpenModel().sendRedPack(10,5);
            System.out.println(list);
        }

    }
}
