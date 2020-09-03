package day18.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/28 12:13
 */
public class Test03 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("Module1/b.txt",true);
            for (int i = 0; i < 5; i++) {
                fos.write("\r\ni love java".getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
