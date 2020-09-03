package day20;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 余俊锋
 * @date 2020/8/31 19:41
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        //服务器
        ServerSocket server=new ServerSocket(8080);
        Socket client = server.accept();
         InputStream is = client.getInputStream();
         byte[] buff=new byte[1024];
         int index;
         StringBuilder sb=new StringBuilder();
         while ((index=is.read(buff))!=-1){
             sb.append(new String(buff,0,index));
         }
        System.out.println(sb.toString());
         CloseUtiles.close(server);
    }
}
