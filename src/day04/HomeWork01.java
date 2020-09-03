package day04;

public class HomeWork01 {
    public static void main(String[] args) {
        printEven(20);
        System.out.println("总数和："+getSum(100));
        int length=20,width=8;
        System.out.println("长方形周长"+getperimeter(length,width));
        System.out.println("长方形面积"+getArea(length,width));
        System.out.println(getChar(65));
        System.out.println(showColor(""));
        printXShape(9);
        System.out.println();
        System.out.println(round(10.1f));
        System.out.println(round(10.4f));
        System.out.println(round(10.5f));
        System.out.println(round(10.9f));
        System.out.println(changTemperature(86.0));
        printPicture();

    }

    //第一题
    public static void printEven(int n){
        for (int i = 1; i < n+1; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    //第二题
    public static int getSum(int n){
        int sum=0;
        for (int i = 1; i < n+1; i++) {
            sum+=i;
        }
        return sum;
    }

    //第三题
    public static int getperimeter(int length,int width){
        int girth=2*width+2*length;
        return girth;
    }
    public static int getArea(int length,int width){
        return  length*width;
    }

    //第四题
    public static char getChar(int num){
        //小写字母a-z 97 122 大写字母 65 90
        char ch=(char)num;
        if ('a'<=ch&&'z'>=ch||'A'<=ch&&'Z'>=ch||'0'<=ch&&'9'>=ch){
            return ch;
        }else {
            return ' ';
        }

    }

    //第五题
    public static String showColor(String color){
       color= color.toLowerCase();
        switch (color){
            case "red":
                return "红色！";
            case "blue":
                return "蓝色！";
            case "green":
                return "绿色！";
           default:
                return "未知颜色！";

        }
    }

    //第六题
    public static void printXShape(int num){
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

    //第七题
    public static String round(float num){
        int m=(int)(num+0.5f);
        return num+"->"+m;
    }

    //第8题
    public static String changTemperature(double fahrenheit){
       double temperature=(fahrenheit-32)/(9.0/5);
        System.out.println("摄氏度为："+temperature+"°--华氏度为："+fahrenheit+"°");
      return  "华氏度为："+fahrenheit+"°--摄氏度为："+temperature+"°";
    }

    //第九题
    public static void printPicture(){
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
