package day03.idemo;

/**
 * switch
 *          固定值  case比较
 *          执行相应的语句体
 *          break;
 *          case穿透性，当匹配的case后面没有break,都会执行下一个语句体，直到遇到break
 */

public class TestSwitch {
    public static void main(String[] args) {
        int week=10; //byte（1） shot（2） int（4） char（2） String(1.7以上)
        switch (week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
                default:
                    System.out.println("不合法的日期");
        }
    }
}
