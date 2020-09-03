package day17.test01;

import java.io.File;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/27 13:31
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File file=new File("d:/a.txt");
        System.out.println(file.exists());
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
