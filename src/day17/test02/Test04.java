package day17.test02;

import java.io.File;

/**
 * @author 余俊锋
 * @date 2020/8/27 17:33
 */
public class Test04 {
    public static void main(String[] args) {
        getTarget(new File("Module1/src/day03/Break"));
    }


    public static void getTarget(File file){
        File[] files = file.listFiles((f)->{
            return f.getName().endsWith(".java")&&f.isFile();
        });

        for (File file1 : files) {
            System.out.println(file1.getName());
        }
    }
}
