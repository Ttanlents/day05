package day10;



public class Student {
    public String name="马云";
    protected String car="车";
    private  String house="房子";
    int   age=56;
    public static void main(String[] args) {
        new Student().test();
        System.out.println(new Student().house);
    }
    public void test(){
        System.out.println(new Student().name);
        System.out.println(new Student().car);
        System.out.println(new Student().age);
        System.out.println(new Student().house);
    }
}
