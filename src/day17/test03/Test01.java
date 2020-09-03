package day17.test03;

import java.io.File;

/**
 * @author 余俊锋
 * @date 2020/8/27 18:06
 */
public class Test01 {
    public static void main(String[] args) {
        File file=new File("d:/a.txt");

    }

    public static void getFile(File file){
        File[] files = file.listFiles((f)->{
            return f.length()>200*1024;
        });
        for (File file1 : files) {
            System.out.println(file1.getName()+",大小："+file1.length());
        }
    }
}
