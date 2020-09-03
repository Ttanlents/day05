package day18.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/28 12:10
 */
public class Test02 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("Module1/b.txt",true);
            fos.write("写点东西".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
