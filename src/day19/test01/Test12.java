package day19.test01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author 余俊锋
 * @date 2020/8/29 13:10
 */
public class Test12 {
    public static void main(String[] args) {
        BufferedReader bf=null;
        Path path= Paths.get("Module1/a.txt");
        Path path2= Paths.get("Module1/b.txt");
        try {
            Files.copy(path,path2,StandardCopyOption.COPY_ATTRIBUTES );
           bf=new BufferedReader(new FileReader("Module1/b.txt"));
            String message="";
            while ((message=bf.readLine())!=null){
                System.out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bf!=null){
                try {
                    bf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
