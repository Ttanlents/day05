package day17;

import java.io.File;
import java.io.FileFilter;

/**
 * @author 余俊锋
 * @date 2020/8/27 14:55
 */
public class Test04 {
    public static void main(String[] args) {
        File dir = new File("Module1/src");
        printDir2(dir);
    }

    public static void printDir2(File dir) {
        // 匿名内部类方式,创建过滤器子类对象
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().startsWith("Dog")||pathname.isDirectory();
            }
        });
        // 循环打印
        for (File file : files) {
            if (file.isFile()) {
                System.out.println("文件名:" + file.getAbsolutePath());
            } else {
                printDir2(file);
            }
        }
    }
}
