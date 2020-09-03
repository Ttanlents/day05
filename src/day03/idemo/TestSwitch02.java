package day03.idemo;

/**
 * switch
 *          固定值  case比较
 *          执行相应的语句体
 *          break;
 *          case穿透性，当匹配的case后面没有break,都会执行下一个语句体，直到遇到break
 *
 *          + = 自带强转特点
 */

public class TestSwitch02 {
    public static void main(String[] args) {
        int week=3 ;  //byte shot int char String(JDK 1.7以上)
        switch (week){
            case 1:
            case 2:
                System.out.println("吃包子");
                break;
            case 3:
            case 4:
                System.out.println("吃饺子");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("不吃早餐");
                break;
                default:
                    System.out.println("不合法的日期");
        }
    }
}
