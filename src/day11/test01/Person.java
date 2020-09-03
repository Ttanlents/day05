package day11.test01;


import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Object
 * 1.== 基本类型比较的是内容  引用类型比较内存地址
 * 2.equals 不重写比较的是内存地址，重写比较的是内容
 *             Objects类
 *      （1）高级用法Objects.equals(s3,s1)
 * 3.hashcode()
 *        (1)hashcode不同，内容一定不同
 *        （2）hashcode相同，内容不一定相同
 *
 */

public class Person {
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1=new Person("abc","20");
        Person p2=new Person("abc","20");
      //  System.out.println(p1.equals(p2));
        System.out.println(Objects.equals(p1,p2));

       // System.out.println(new Date(2020-1900,7,19));
        System.out.println(Integer.toBinaryString(128));


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
