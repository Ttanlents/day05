package day17.test01;

import java.io.File;

/**
 * @author 余俊锋
 * @date 2020/8/27 13:35
 */
public class Test05 {
    public static void main(String[] args) {
        File file=new File("d:/a.txt");
        file.delete();
        File file1=new File("d:/a.aaa");
        file1.delete();

    }
}
