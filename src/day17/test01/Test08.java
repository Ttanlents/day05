package day17.test01;

import java.io.File;

/**
 * @author 余俊锋
 * @date 2020/8/27 17:00
 */
public class Test08 {
    public static void main(String[] args) {
        File file=new File("d/aaa");

        for (String s : file.list()) {
            System.out.println(s);
        }
    }
}
