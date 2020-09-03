package day07._08;

public class Test {
    public static void main(String[] args) {
        String java="javajﬁewjavajﬁowfjavagkljjava";
        int count=0;
        int index=java.indexOf("java");
        while (index!=-1){
            count++;
            java=java.substring(index+1);
            index=java.indexOf("java");
        }
        System.out.println("java出现次数  ："+count);
    }
}
