package day21;

/**
 * @author 余俊锋
 * @date 2020/9/2 10:58
 */
public class User {
    public String name;
    private Integer age;
    private  String sex;

    public User() {
    }

    private User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    private User( Integer age, String sex) {

        this.age = age;
        this.sex = sex;
    }
    private  void eat(String food){
        System.out.println(this.name+"吃"+food);


    }
    private static void eat2(String food){
        System.out.println(food);

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
