package day23;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 余俊锋
 * @date 2020/9/3 15:52
 */
public class Test04 {
    public static void main(String[] args) throws Exception {
        File file = new File("d:/test/a.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss sss");
        Date date = new Date();
        String time = df.format(date);
        System.out.println(time);
        String[] filename=file.getName().split("\\.");
        String prefix=filename[0];
        String suffix=filename[1];
        //new FileWriter("d:/test/" + time +prefix+"."+suffix)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/test/" + time +prefix+"."+suffix),"GBK"));
        String message;
        while ((message=br.readLine())!=null){
            bw.write(message);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
