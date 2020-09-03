package day18.test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/28 12:19
 */
public class Test05 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("Module1/b.txt");
            int index=-1;
            byte[] car=new byte[1024];
            while ((index=fis.read(car))!=-1){
                System.out.println(new String(car,0,index));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

