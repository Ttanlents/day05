package day03.idemo;

/**
 * 成绩 if  else
 */


public class Test03 {
    public static void main(String[] args) {
        int score=90;
        if (score<0||score>100){
            System.out.println("分数输入有误");
        }else if (score>=90&&score<=100){
            System.out.println("优秀！");
        }else if (score>=60&&score<90){
            System.out.println("成绩合格");
        }else{
            System.out.println("成绩不合格");
        }
    }
}
