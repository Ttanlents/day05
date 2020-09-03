package day16.test01;

import java.util.Objects;
import java.util.Random;

/**
 * @author 余俊锋
 * @date 2020/8/26 18:24
 */
public class Person {
    private  String name;
    private String sex;


    Random random;
    public Person() {
        this.random=new Random();
    }

    public Person(String name, String sex) {
        this.random=new Random();
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(sex, person.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public void setNameAndSex(){

        while (true){
            synchronized (this){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (Objects.equals(this.getName(),"")&&Objects.equals(this.getSex(),"")){
                    System.out.println("开始修改属性中。。。");
                    String[] names={"小明","小红","小杰克","笑笑"};
                    String[] sexs={"男","女"};
                    this.setName(names[random.nextInt(4)]);
                    this.setSex(sexs[random.nextInt(2)]);
                }else {

                    this.notifyAll();
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
    public void print(){
        while (true){
            synchronized (this){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!Objects.equals(this.getName(),"")){
                    System.out.println("开始打印属性....");
                    System.out.println(this.name+", "+this.sex);
                   this.setName("");
                   this.setSex("");
                }else {
                    this.notifyAll();
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
