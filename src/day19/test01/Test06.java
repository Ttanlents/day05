package day19.test01;

import java.io.*;

/**
 * @author 余俊锋
 * @date 2020/8/29 12:18
 */
public class Test06 {
    public static void main(String[] args) {
        String filename="Module1/a.txt";
        BufferedReader bf=null;
        StringBuilder sb=new StringBuilder();
        try {
            InputStreamReader isr=  new InputStreamReader(new FileInputStream(filename),"GBK");
            bf=new BufferedReader(isr);
            String content="";
            while ((content=bf.readLine())!=null){
                sb.append(content);
            }
            System.out.println(sb.toString());
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
}
