package day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author 余俊锋
 * @date 2020/9/1 16:34
 */
public class Test07_Client {
    public static void main(String[] args) throws IOException {
        //模拟多个客户端
        System.out.println("客户端");
        for (int i = 0; i < 10; i++) {
            Socket client = new Socket("localhost",8080);
            BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Module1/a.txt"));
            BufferedOutputStream bos=new BufferedOutputStream(client.getOutputStream());

            byte[] buff=new byte[8*1024];
            int len;
            while ((len=bis.read(buff))!=-1){
                System.out.println("读取文件");
                bos.write(buff,0,len);
                bos.flush();
            }
            //bos.close();
            client.shutdownOutput();
            System.out.println("文件发送完毕");
            //解析回写
            BufferedInputStream br=new BufferedInputStream(client.getInputStream());
            byte[] car=new byte[1024];
            br.read(car);
            String message=new String(car);
            System.out.println("服务器反馈信息："+message);
            bos.close();
            br.close();
            CloseUtiles.close(bis,client);
        }

    }
}
