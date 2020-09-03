package day05;

public class Dog {
 private    String name;
 private    Integer age;
  private   String color;


    public Dog() {
    }

    public Dog(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

   public void tail(){
       System.out.println(name+"今年"+age+"岁了，"+"是"+color+"正在向某人摇尾巴");
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
