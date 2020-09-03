package day20;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/9/1 18:02
 */
public class Test08_Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 8080);
        BufferedOutputStream bos=new BufferedOutputStream(client.getOutputStream());
        BufferedInputStream br=new BufferedInputStream(client.getInputStream());
        System.out.println("请输入一个账号密码，格式是：jack=123456");
        Scanner scanner=new Scanner(System.in);
        String message=scanner.next();
        bos.write(message.getBytes());
        bos.flush();
        client.shutdownOutput();
        System.out.println("刷出去了");
        byte[] buff=new byte[2*1024];
        int len=-1;
        while ((len=br.read(buff))!=-1){
            System.out.println(new String(buff,0,len));
        }
       bos.close();
       br.close();



    }
}
