package day16.test01;

import java.util.Objects;

/**
 * @author 余俊锋
 * @date 2020/8/26 18:08
 */
public class Student {
    String name;
    Integer Score;

    public Student() {
    }

    public Student(String name, Integer score) {
        this.name = name;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer score) {
        Score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(Score, student.Score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
