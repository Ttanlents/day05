package day12.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> carList=new ArrayList<>();

        List<String> numbers=new ArrayList<>();
        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");

        List<String> colors=new ArrayList<>();
        colors.add("♠");
        colors.add("♥");
        colors.add("♦");
        colors.add("♣");
        for (String color : colors) {
            for (String s : numbers) {
                carList.add(color+s);
            }
            for (int i = 2; i <= 10; i++) {
                carList.add(color+i);
            }
        }
        carList.add("小王");
        carList.add("大王");
        System.out.println(carList);
        System.out.println(carList.size());
        Collections.shuffle(carList);
        System.out.println(carList);
        sendCard(carList);
    }


    public static void sendCard(List<String> list){
        int flag=0;
        List<String> play1=new ArrayList<>();
        List<String> play2=new ArrayList<>();
        List<String> play3=new ArrayList<>();
        List<String> dipai=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String card=list.get(i);
            if (i>50){
                dipai.add(card);
            }
            if (i%3==0){
                if (card.equals("大王")){
                    flag=1;
                }
                play1.add(card);
            }else if (i%3==1){
                if (card.equals("大王")){
                    flag=2;
                }
                play2.add(card);
            }else {
                if (card.equals("大王")){
                    flag=3;
                }
                play3.add(card);
            }

        }
        switch (flag){
            case 1:
                play1.addAll(dipai);
                dipai.clear();
                break;
            case 2:
                play2.addAll(dipai);
                dipai.clear();
                break;
            case 3:
                play3.addAll(dipai);
                dipai.clear();
                break;
                default:
                    System.out.println("发牌错误");
        }
        System.out.println(play1);
        System.out.println(play2);
        System.out.println(play3);
        System.out.println(dipai);
    }

}
