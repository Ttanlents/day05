package day04;

/**
 * 颜色背景  C7EDCC
 */

public class TestFunction03  {
    public static void main(String[] args) {
            new TestFunction03().getXShape(8);
    }
    //第一题
    public String grades(int score){
        if (score<0||score>100){
          return   "成绩有误！";
        }else if (score>=90&&score<=100){
           return  "优秀！";
        }else if (score>=80&&score<90){
           return "好";
        }else if (score>=70&&score<80){
            return  "良";
        }else if (score>=60&&score<70){
            return  "及格";
        }else {
            return  "不及格";
        }
    }
    //第二题
    public int getOddSum(){
        int oddSum=0;
        for (int i = 1; i <100 ; i++) {
            if (i%2!=0){
                oddSum+=i;
            }

        }
        return oddSum;
    }

    //第三题
    public int getSum(){
        int sum=0;
        for (int i = 1; i < 100; i++) {
            if (i%3==0&&i%5==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }

    //第四题
    public void getI(){
        int i=1;
        while (i<=10){
            System.out.println("i: "+i);
            i++;
        }
    }

    //第五题
    public void work05(){
        for (int i = 1; i < 15; i++) {
            if (i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }

    //第六题
    public void getDaffdoil(){
        for (int i = 100; i <=999; i++) {
            int  ge=i%10;
            int shi=i/10%10;
            int bai=i/100;
            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==i){
                System.out.println(i);
            }
        }
    }

    //第七题
    public void getPicture(){
        int count=0;
        for (int i = 1; i <= 60; i++) {
            if (i%2==0){
                System.out.print(i+" ");
                count++;
                if (count==5){
                    System.out.println();
                    count=0;
                }
            }
        }
    }

    //第八题
    public void getStarAcne(){
        for (int i = 1; i <=12 ; i++) {
            switch (i){
                case 1:
                    System.out.println("1:水瓶");
                    break;
                case 2:
                    System.out.println("2:双鱼");
                    break;
                case 3:
                    System.out.println("3:白羊");
                    break;
                case 4:
                    System.out.println("4:金牛");
                    break;
                case 5:
                    System.out.println("5:双子");
                    break;
                case 6:
                    System.out.println("6:巨蟹");
                    break;
                case 7:
                    System.out.println("7:狮子");
                    break;
                case 8:
                    System.out.println("8:处女");
                    break;
                case 9:
                    System.out.println("9:天平秤");
                    break;
                case 10:
                    System.out.println("10:天蝎");
                    break;
                case 11:
                    System.out.println("11:射手");
                    break;
                case 12:
                    System.out.println("12:摩羯");
                    break;
                default:
                    System.out.println("无效星座");
            }
        }
    }

    //第九题
    public void getXShape(int num){
        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <=num ; j++) {
                if (i==j||(i+j)==num+1){
                    System.out.print("O"+" ");
                }else {
                    System.out.print("*"+" ");
                }
            }
        }
    }


}
