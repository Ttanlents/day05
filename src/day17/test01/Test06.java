package day17.test01;

import java.io.File;

/**
 * @author 余俊锋
 * @date 2020/8/27 13:36
 */
public class Test06 {
    public static void main(String[] args) {
        File file = new File("c:/aaa/a.txt");
        System.out.println(file.getName());
        //绝对路径
        System.out.println(file.getAbsolutePath());
        //相对路径
        System.out.println(file.getPath());
        //文件字节大小
        System.out.println(file.length());
        //文件的父路劲
        System.out.println(file.getParent());
    }
}
