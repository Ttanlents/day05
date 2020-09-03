package day14.Card;

import java.util.*;

public class CardWork {

    public static void main(String[] args) {
        //牌盒
        Map<Integer, String> map = getCard();
        //洗牌
        List<Integer> list = shuffle();

        //发牌给3个人
        Map<String, List<String>> lists = personsCard(map, list);

        for (Map.Entry<String, List<String>> entry : lists.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }

    public static Map<Integer, String> getCard() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "大王");
        map.put(1, "小王");
        //花色
        List<String> colors = listUtils.of("♥", "♠", "♦", "♣");
        //牌盒
        List<String> carList = new ArrayList<>();
        //数字
        List<String> numbers = listUtils.of("2", "A", "K", "Q", "J");
        for (int i = 10; i >= 3; i--) {
            numbers.add(i + "");
        }
        for (String number : numbers) {
            for (String color : colors) {
                carList.add(color + number);
            }
        }
        for (int i = 2; i <= 53; i++) {
            map.put(i, carList.get(i - 2));
        }
        return map;
    }

    public static List<Integer> shuffle() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }

    public static Map<String, List<String>> personsCard(Map<Integer, String> map, List<Integer> list) {
        List<Integer> p1 = new ArrayList<>();
        List<Integer> p2 = new ArrayList<>();
        List<Integer> p3 = new ArrayList<>();
        List<Integer> dipai = new ArrayList<>();
        List<List<Integer>> ps = listUtils.of(p1, p2, p3);

        for (int i = 0; i < list.size(); i++) {
            int card = list.get(i);
            if (i > 50) {
                dipai.add(card);
            } else {
                if (i % 3 == 0) {
                    p1.add(card);
                } else if (i % 3 == 1) {
                    p2.add(card);
                } else {
                    p3.add(card);
                }

            }
        }

        //如果包含大王就拿底牌
        boolean flag = false;
        for (List<Integer> p : ps) {
            for (Integer integer : p) {
                if (integer == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                p.addAll(dipai);
                break;
            }
        }

        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(dipai);
        Map<String, List<String>> orderMap = new HashMap<>();
        orderMap.put("令狐冲", getOneCard(p1, map));
        orderMap.put("石破天", getOneCard(p2, map));
        orderMap.put("鸠摩智", getOneCard(p3, map));
        orderMap.put("底牌", getOneCard(dipai, map));

        return orderMap;
    }

    public static List<String> getOneCard(List<Integer> p, Map<Integer, String> map) {
        List<String> tempList = new ArrayList<>();
        for (Integer s : p) {
            if (map.containsKey(s)) {
                tempList.add(map.get(s));
            }
        }
        return tempList;
    }
}





