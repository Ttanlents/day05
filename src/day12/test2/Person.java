package day12.test2;

public class Person {
    private String name;
    private  int age;
    private double tall;

    public Person() {
    }

    public Person(String name, int age, double tall) {
        this.name = name;
        this.age = age;
        this.tall = tall;
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

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tall=" + tall +
                '}';
    }
}
