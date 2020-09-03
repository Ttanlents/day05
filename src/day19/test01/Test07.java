package day19.test01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 余俊锋
 * @date 2020/8/29 12:22
 */
public class Test07 {
    public static void main(String[] args) {
        Student student=new Student("jack",18,"男");
        ObjectOutputStream oos=null;
        try {
            oos=new ObjectOutputStream(new FileOutputStream("Module1/a.txt"));
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
