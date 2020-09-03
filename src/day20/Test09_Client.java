package day20;

import java.io.*;
import java.net.Socket;

/**
 * @author 余俊锋
 * @date 2020/9/1 19:38
 */
public class Test09_Client {
    public static void main(String[] args) throws IOException {
        //模拟多个客户端
        System.out.println("客户端");
        for (int i = 0; i < 10; i++) {
            Socket client = new Socket("localhost",8080);
            BufferedOutputStream bos2=new BufferedOutputStream(new FileOutputStream("Module1/b.jpg"));
            BufferedInputStream bis2=new BufferedInputStream(client.getInputStream());
            byte[] buff=new byte[8*1024];
            int len;
            while ((len=bis2.read(buff))!=-1){
                System.out.println("下载文件中");
                bos2.write(buff,0,len);
                bos2.flush();
            }
            bos2.close();
            bis2.close();
            client.close();
        }

    }
}
