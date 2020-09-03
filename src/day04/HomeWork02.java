package day04;

import java.util.Arrays;

public class HomeWork02 {

    public static void main(String[] args) {
        System.out.println(getMinValue());
        printArr();
        getNewArr();
        int arr[]={1,8,10,12,18,28,12};
        System.out.println();
        printBall(arr);
        int arr1[]={95,92,72,56,98,71,80,58,91,91};
        int count=0;
        for (int a:arr1){
            if (a>getAvg(arr1)){
                count++;
            }
        }
        System.out.println();
        System.out.println("高于平均分："+getAvg(arr1)+"的个数有"+count+"个");
        int a[]={1,1,2,3,4,3,2,1};
        int b[]={1,1,2,3,4,3,2,1};
        System.out.println(Arrays.toString(a)+"是否对称;"+isLike(a));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println("是否一致："+equals(a,b));

        char ming[]={'D','C','B','A','D'};
        char hong[]={'A','D','B','C','D'};
        char huang[]={'A','D','B','C','A'};
        char qiang[]={'A','B','C','D','D'};
        getScore(ming,"小明");
        getScore(ming,"小红");
        getScore(ming,"小黄");
        getScore(ming,"小强");

        printBook();
        System.out.println(getfinalScore(new int[]{99,100,97,96}));

    }
    //第一题
    public static int getMinValue(){
        int arr[]={12,33,25,6,16};
        int min=arr[0];
        for (int value:arr){
            if (value<min){
                min=value;
            }
        }
        return min;
    }
    //第二题
    public static void printArr(){
        int[] arr={11,22,33,44,55};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //第三题
    public static void getNewArr(){
        int[] nums={5,10,15};
        int[] newArr=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
            newArr[i]=nums[i]*2;
        }
        System.out.println();
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }

    }

    //第四题
    public static void printBall(int[] array){
        System.out.println("您的双色球号码为：");
       for (int a:array){
           System.out.print(a+" ");
       }
    }

    //第五题
    public static int getAvg(int arr[]){
        int sum=0;
        for (int a:arr){
            sum+=a;
        }
        int avg=sum/arr.length;
        return avg;
    }

    //第六题
    public static boolean isLike(int arr[]){
        boolean falg=true;
        for (int start = 0,end=arr.length-1; start < end; start++,end--) {
            if (arr[start]!=arr[end]){
                falg= false;
            }
        }
        return falg;
    }
    //第七题
    public static boolean equals(int a[],int b[]){
       if (a.length!=b.length){
           return false;
       }
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    //第八题
    public static void getScore(char a[],String name){
        char right[]={'A','D','B','C','D'};

        int score=0;
        for (int i = 0; i < right.length; i++) {
            if (a[i]==right[i]){
                score+=2;
            }
        }
        System.out.println("满分10分,"+name+"得分："+score);

    }
    //第九题
    public static void printBook(){
        String[] a={"黑桃","红桃","梅花","方块"};
        String[] b={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(a[i]+b[j]+"\t");
            }
            System.out.println();
        }
    }

    //第十题
    public static String getfinalScore(int a[]){
        int maxScore=a[0];
        int minScore=a[0];
        int sum=0;
        for (int b:a) {
            if (b>maxScore){
                maxScore=b;
            }
            if (b<minScore){
                minScore=b;
            }
            sum+=b;
        }
        return "最终得分; "+ (sum-maxScore-minScore)/(a.length-2);

    }
}
