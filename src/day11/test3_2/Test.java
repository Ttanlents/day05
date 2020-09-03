package day11.test3_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    static List<Product> list;
    static List<shopCar> list2;

    static {
        list = new ArrayList<>();
        list.add(new Product("001", "少林核桃", 15.5, "斤"));
        list.add(new Product("002", "曲奇饼干", 14.5, "包"));
        list.add(new Product("003", "固态硬盘", 345.0, "个"));
        list.add(new Product("004", "高清视频", 199.0, "G"));
    }

    public static void main(String[] args) {

        System.out.println("         欢迎使用超市购物系统！");
        System.out.println("===========================================");
        String inputMessage = "";
        while (!inputMessage.equals("3")) {
            System.out.println("请输入你要进行的操作：");
            System.out.println("1:购物商品       2:结算并打印小票    3.退出系统");
            Scanner scanner = new Scanner(System.in);
            inputMessage = scanner.next();
            switch (inputMessage) {
                case "1":
                    buyProduct();
                    break;
                case "2":
                    accounts();
                    break;
                case "3":
                    exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入！");

            }
        }
    }

    public static void buyProduct() {
        System.out.println("--------------------------------------");
        System.out.println("商品id   名称     单价    计价单位");
        for (Product p : list) {
            System.out.println(p.getId() + "   " + p.getName() + "    " + p.getPrice() + "    " + p.getUnit());
        }
        System.out.println("--------------------------------------");
        System.out.println("请输入您要购买的商品项（输入格式：商品id-购买数量），输入end表示结束购买。");
        Scanner scanner = new Scanner(System.in);
        String inputMessage = "";
        while (!inputMessage.equals("end")) {
            inputMessage = scanner.next();
            if (Objects.equals(inputMessage, "end")) {
                break;
            }
            //strArr[0].matches("00[0-" + len + "]");
            if (!(inputMessage.length() >= 5 && inputMessage.charAt(3) == '-')) {
                System.out.println("您输入的购物姿势不对，请换一个输入姿势（输入格式：商品id-购买数量）");
                continue;
            }
            if (!(inputMessage.startsWith("001") || inputMessage.startsWith("002") || inputMessage.startsWith("003") || inputMessage.startsWith("004"))) {
                System.out.println("您输入的商品id不存在");
                continue;
            }
            String[] str = inputMessage.split("-");

            if (str.length == 2) {
                String productId = str[0];
                int productCount = Integer.parseInt(str[1]);
                for (Product p : list) {
                    if (p.getId().equals(productId)) {
                        if (list2 == null) {
                            list2 = new ArrayList<>();
                            list2.add(new shopCar(p, productCount, p.getPrice()));
                        } else {
                            boolean falg = false;
                            for (shopCar shopCar : list2) {
                                if (Objects.equals(shopCar.getProduct().getId(), p.getId())) {
                                    shopCar.setCount(shopCar.getCount() + productCount);
                                    shopCar.setTotalPrice(shopCar.getTotalPrice() + productCount * p.getPrice());
                                    falg = true;
                                }
                            }
                            if (!falg) {
                                list2.add(new shopCar(p, productCount, p.getPrice()));
                            }
                        }
                    }
                }
            }
            //end--

        } //循环结束
        System.out.println("购买结束");
    }

    public static void accounts() {
        double allMoney = 0;
        int count = 0;
        System.out.println("--------------------------------------");
        System.out.println("----------------欢迎光临--------------");
        System.out.println("名称   售价     数量    金额");
        System.out.println("--------------------------------------");
        for (shopCar shopCar : list2) {
            System.out.println(shopCar.getProduct().getName() + "    " + shopCar.getProduct().getPrice() + "    " + shopCar.getCount() + "    " + shopCar.getTotalPrice());
            allMoney += shopCar.getTotalPrice();
            count += shopCar.getCount();
        }
        System.out.println("--------------------------------------");
        System.out.println(list2.size() + "项商品");
        System.out.println("共计：" + count + "件");
        System.out.println("共：" + allMoney + "元");
        list2.clear();
    }

    public static void exit() {
        System.out.println("--------------------------------------");
        System.out.println("感谢您使用超市购物系统，欢迎下次光临，拜拜");
    }
}
