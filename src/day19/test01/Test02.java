package day19.test01;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/29 11:45
 */
public class Test02 {
    public static void main(String[] args) {
        BufferedOutputStream bw=null;
        try {
            bw=new BufferedOutputStream(new FileOutputStream("Module1/a.txt"));
            bw.write("i love java".getBytes());
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
