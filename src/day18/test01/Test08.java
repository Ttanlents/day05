package day18.test01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/8/28 12:34
 */
public class Test08 {
    public static void main(String[] args) {
        FileOutputStream os = null;
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        try {
            os = new FileOutputStream("Module1/b.txt");
            while (true) {
                String message = scanner.nextLine();
                if (message.equals("886")) {
                    break;
                }
                try {
                    os.write((message+"\r\n").getBytes());
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
