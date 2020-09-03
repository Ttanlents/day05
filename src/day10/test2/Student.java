package day10.test2;

public class Student {
    String name;
    String attend;

    public Student() {
    }

    public Student(String name, String attend) {
        this.name = name;
        this.attend = attend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }
}
