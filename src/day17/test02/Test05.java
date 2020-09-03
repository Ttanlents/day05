package day17.test02;

import java.io.File;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/8/27 17:41
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        File file=new File(scanner.next());
        printFile(file);

    }

    public static void printFile(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                file1.delete();
            }else {
                printFile(file1);
            }
        }
        file.delete();

    }
}
