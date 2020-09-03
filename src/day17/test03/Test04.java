package day17.test03;

import java.io.File;

/**
 * @author 余俊锋
 * @date 2020/8/27 18:25
 */
public class Test04 {
    static int size;
    public static void main(String[] args) {
        File dir = new File("Module1/src");
        printFile(dir,0);
    }
    public static void printFile(File file,int count){
        File[] files=file.listFiles();


        for (File file1 : files) {
            for (int i = 0; i < count; i++) {
                System.out.print(" - ");
            }
            if (file1.isFile()){
                System.out.println(file1.getName());
                size+= file1.length();
                continue;
            }

            System.out.println(file1.getName());
            printFile(file1,count+1);
        }
    }
}
