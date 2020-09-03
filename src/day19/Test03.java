package day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 余俊锋
 * @date 2020/8/31 11:47
 */
public class Test03 {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("Module1/a.png"));
        BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("Module1/f.png"));
        int index;
        while ((index = bufis.read()) != -1) {
            bufos.write(index);
        }
        CloseUtiles.close(bufos, bufis);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
