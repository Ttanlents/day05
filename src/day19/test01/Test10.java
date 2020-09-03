package day19.test01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/8/29 12:38
 */
public class Test10 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        BufferedReader bf=null;
        BufferedWriter bw=null;
        try {
            bf=new BufferedReader(new FileReader("Module1/a.txt"));
            String content="";
            while ((content=bf.readLine())!=null){
                System.out.println(content);
                list.add(content);
            }
            Collections.reverse(list);
            System.out.println(list);
            bw=new BufferedWriter(new FileWriter("Module1/a.txt"));
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
