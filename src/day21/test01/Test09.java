package day21.test01;

import java.io.*;
import java.util.Properties;

/**
 * @author 余俊锋
 * @date 2020/9/2 16:00
 */
public class Test09 {
    public static void main(String[] args) throws Exception {
        File file=new File("Module1/src/day21/test01/application2.properties");

        if (!file.exists()){
            file.createNewFile();
        }
        Properties properties = new Properties();
        properties.load(new FileInputStream(file));
        String content=(String) properties.get("count");
       if (content==null){
           store(file,0);
           properties.load(new FileInputStream(file));
           content=(String) properties.get("count");
       }
        int count=Integer.parseInt(content);
        if (count<3){
            store(file,++count);
            System.out.println("已经执行次数："+count);

        }else {
            System.out.println("程序使 用次数已满，请续费");
        }

    }

    public static void store(File file,int count){
        try {
            BufferedWriter  bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            bufferedWriter.write("count="+count);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
