package day13.test03;

import java.util.Objects;

public class Clazz {
    private Student student;

    public Clazz(Student student) {
        this.student = student;
    }

    public Clazz() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clazz clazz = (Clazz) o;
        return Objects.equals(student, clazz.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student);
    }
}
