package day09.test6;

public class Test {
    public static void main(String[] args) {
        Person t1=new Teacher("马云",45);
        Sport t2=new sportTeacher("大姚",35);
        Person s1=new Student("小王",20);
        Sport s2=new SportStudent("中王",21);
        goToSport(t2);
        goToSport(s2);
    }
    static void goToSport(Sport sport){
        sport.playBasketball();

    }
}


