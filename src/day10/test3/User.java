package day10.test3;

public class User {
    String type;
    int id;

    public User(int id) {
        this.id = id;
    }

    public User(String type, int id) {
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
