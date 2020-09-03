package day08._05;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age,String subject) {
        super(name, age);
        this.subject = subject;
    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
