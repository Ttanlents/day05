package day17.test01;

import java.io.File;

/**
 * @author 余俊锋
 * @date 2020/8/27 13:40
 */
public class Test07 {
    public static void main(String[] args) {
        File file=new File("d:/a.txt");
        File  file2=new File("d:/aaa");
        System.out.println(file.getName()+"是文件吗"+file.isFile());
        System.out.println(file2.getName()+"是目录"+file.isDirectory());
    }
}
