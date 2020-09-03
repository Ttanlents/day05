package day19.test01;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author 余俊锋
 * @date 2020/8/29 12:35
 */
public class Test09 {
    public static void main(String[] args) {
        PrintStream ps=null;
        try {
           ps=new PrintStream("Module1/a.txt");
          System.setOut(ps);
            System.out.println("猪八戒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            ps.close();
        }

    }
}
