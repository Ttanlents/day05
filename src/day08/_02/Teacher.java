package day08._02;

public class Teacher  extends  Person{

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void work(){
        System.out.println(name+"上课");
    }
}
