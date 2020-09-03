package day20;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/9/1 12:29
 */
public class Test06_Client {
    public static void main(String[] args) throws IOException {
        //客户端
        Socket client = new Socket("localhost", 8080);
        System.out.println("客户端启动成功");
        InputStream is = client.getInputStream();
        OutputStream os = client.getOutputStream();

        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));

        Scanner scanner = new Scanner(System.in);
        //发消息
        while (true) {
            System.out.println("请输入一条消息：");
            String message = scanner.next();
            System.out.println("我要发送的消息是"+message);
            bw.write(message);
            bw.newLine();
            bw.flush();
            if (message.equals("end")) {
                bw.close();
                client.close();
                return;
            }
            //接消息
            String message2 = br.readLine();
            System.out.println("readline"+message2);
            if (message2.equals("end")){
               br.close();
               client.close();
               return;
            }
            System.out.println("收到服务器的消息："+message2);
        }
    }
}
