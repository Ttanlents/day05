package day17;

import java.io.File;

/**
 * @author 余俊锋
 * @date 2020/8/27 11:01
 */
public class Test02 {

    static long size;
    public static void main(String[] args) {
        File file=new File("Module1/src");
           printFile(file,0);
        System.out.println("文件大小"+size+"字节");
    }


    /**
     * 遍历文件
     */
    /*public static void printFile(File file,int count){
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
    }*/
    public static void printFile(File file, int count){
        File[] files=file.listFiles((f)->{
            return f.getName().startsWith("Dog")||f.isDirectory();
        });


        for (File file1 : files) {
            for (int i = 0; i < count; i++) {
               // System.out.print(" - ");
            }
            if (file1.isFile()){
                System.out.println(file1.getName());
                size+= file1.length();
                continue;
            }

          //  System.out.println(file1.getName());
            printFile(file1,count+1);
        }
    }
}
