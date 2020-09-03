package day13.test02;

import java.util.Objects;

public class Student2 {

    /**
     * name :
     * age : 25
     * score : 95
     */

    private String name;
    private int age;
    private int score;

    public Student2() {
    }

    public Student2(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 user = (Student2) o;
        return age == user.age &&
                score == user.score &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, score);
    }
}
