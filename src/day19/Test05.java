package day19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author 余俊锋
 * @date 2020/8/31 15:53
 */
public class Test05 {

    //序列化一个对象
    public static void main(String[] args) throws Exception {
        ObjectInputStream oos=new ObjectInputStream(new FileInputStream("Module1/p.txt"));
        Person person=(Person) oos.readObject();
        System.out.println(person);
        oos.close();
/*
       ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Module1/p.txt"));
        Person person=new Person("李四",12);
        oos.writeObject(person);
        oos.close();*/
    }
}
