package day18.test02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/8/28 13:27
 */
public class Test01 {
    public static void main(String[] args) {
        FileOutputStream os = null;
        byte[] car = new byte[1024];
        Scanner scanner = new Scanner(System.in);
        try {
            os = new FileOutputStream("Module1/b.txt");
            while (true) {
                System.out.println("请输入学生信息：");
                String messsage = scanner.next();
                if (messsage.equals("end")) {
                    break;
                }
                os.write((messsage + "\r\n").getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
