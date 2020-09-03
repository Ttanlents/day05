package day18.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/28 12:04
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fis=null;
        try {
             fis=new FileOutputStream("./b.txt",true);
             fis.write('a');
             fis.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                fis.close();
            }
        }

    }
}
