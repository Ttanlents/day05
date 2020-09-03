package day19.test01;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author 余俊锋
 * @date 2020/8/29 12:22
 */
public class Student implements Serializable,Cloneable  {
    private static final long serialVersionUID = -842096720454035669L;
    private String name;
    private Integer age;
    private String gender;

    public Student() {
    }

    public Student(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    protected Object clone()  {
        Student student=null;
        try {
             student=(Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  student;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
