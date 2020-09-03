package day20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/9/1 12:29
 */
public class Test06_Server {
    //服务器
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务器启动成功");
        Socket client = serverSocket.accept();
        System.out.println("与客户端建立连接！");
        InputStream is = client.getInputStream();
        OutputStream os = client.getOutputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(os));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            //接收消息
            System.out.println("开始阻塞");
            String   message = br.readLine();
            System.out.println("收到消息，" + message);
            if (message.equals("end")) {
                System.out.println("服务器收到end,结束通讯！");
                is.close();
                client.close();
                return;
            }
            //回复消息
            System.out.println("收到消息，" + message);
            System.out.println("请输入一条消息：");
            String answer = scanner.next();
            bw.write(answer);
            if (answer.equals("end")){
                is.close();
                os.close();
                client.close();
                return;
            }
        }
    }
}
