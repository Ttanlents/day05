package day18;

import java.io.*;

/**
 * @author 余俊锋
 * @date 2020/8/28 10:35
 */
public class Test02 {
    public static void main(String[] args) {
        File file=new File("Module1/a/a/a/a/b.txt");
        FileOutputStream os=null;
        if (!file.exists()){
            file.getParentFile().mkdirs();
        }
        try {
           os=new FileOutputStream(file);
            os.write(97);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
