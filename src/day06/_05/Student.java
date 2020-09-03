package day06._05;

public class Student {
   private String id;
    private String name;
    private double tall;

    public Student(String id, String name, double tall) {
        this.id = id;
        this.name = name;
        this.tall = tall;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTall() {
        return tall;
    }

    public void setTall(double tall) {
        this.tall = tall;
    }
}
