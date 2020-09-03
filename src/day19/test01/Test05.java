package day19.test01;

import java.io.*;

/**
 * @author 余俊锋
 * @date 2020/8/29 12:16
 */
public class Test05 {
    public static void main(String[] args) {
        String filename="Module1/a.txt";
        BufferedWriter bw=null;
        try {
            OutputStreamWriter osw=  new OutputStreamWriter(new FileOutputStream(filename),"GBK");
            bw=new BufferedWriter(osw);
            bw.write("我爱java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
