package day17.test02;

import java.io.File;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/8/27 17:21
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个文件路径：");
        String path="";
        path=scanner.next();
        File file=new File(path);
        if (file.isFile()){
            System.out.println("文件大小："+file.length());
        }else {
            System.out.println("总目录大小："+printFile(file));
        }
    }


    public static long printFile(File file){
        long size=0;
        for (File f : file.listFiles()) {
            if (f.isFile()){
                size+=f.length();
                continue;
            }
            size+=f.length();
            printFile(f);
        }
        return size;
    }
}
