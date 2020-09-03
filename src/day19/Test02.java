package day19;

import java.io.*;

/**
 * @author 余俊锋
 * @date 2020/8/29 11:07
 */
public class Test02 {
    public static void main(String[] args) {
writer();
    }

    /**
     * 读
     */
    public static void read(){
        String filename="Module1/a.txt";
        BufferedReader bf=null;
        try {
            InputStreamReader isr=  new InputStreamReader(new FileInputStream(filename));
            bf=new BufferedReader(isr);
            System.out.println(bf.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writer(){
        String filename="Module1/a.txt";
        BufferedWriter bw=null;
        try {
            OutputStreamWriter osw=  new OutputStreamWriter(new FileOutputStream(filename),"GBK");
            bw=new BufferedWriter(osw);
            bw.write("我来了呀呀呀哎呀呀呀");
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
