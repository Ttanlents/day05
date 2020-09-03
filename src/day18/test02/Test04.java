package day18.test02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author 余俊锋
 * @date 2020/8/28 14:19
 */
public class Test04 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("Module1/b.txt"));
            Set<String> set = properties.stringPropertyNames();
            for (String s : set) {
                System.out.println(s+"="+properties.get(s));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
