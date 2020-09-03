package day05;

public class Friend {
    int age;
    String name;
    String gender;



    public Friend(){

    }

    public Friend(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void action(){
        System.out.println("在化妆！");
    }

    @Override
    public String toString() {
        return "Friend{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
