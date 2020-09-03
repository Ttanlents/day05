package day20;

import java.net.ServerSocket;
import java.net.Socket;


/**
 * @author 余俊锋
 * @date 2020/8/31 19:56
 */
public class Server {
    //服务器
    public static void main(String[] args) throws Exception {
        //服务器
        System.out.println("服务器");
        ServerSocket server=new ServerSocket(8080);
        Socket client = server.accept();
        Sender sender=new Sender(client);
        Listener listener=new Listener(client);
        new Thread(sender).start();
        new Thread(listener).start();

    }
}
