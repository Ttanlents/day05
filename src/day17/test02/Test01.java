package day17.test02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/8/27 17:18
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        String path="";
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个文件路径：");
        path=scanner.next();
        File file=new File(path);
        if (!file.exists()){
            file.createNewFile();
        }else {
            System.out.println(file.getName()+"文件大小是："+file.length());
        }
    }
}
