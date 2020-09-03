package day10.test2;

public class Teacher {
    String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callName(Student student,String attend){
        student.setAttend(attend);    }
}
