package day20;

import java.net.Socket;

/**
 * @author 余俊锋
 * @date 2020/8/31 19:57
 */
public class Client {
    //客户端
    public static void main(String[] args) throws Exception {
        //客户端
        System.out.println("客户端");
        Socket client=new Socket("localhost",8080);
        Sender sender=new Sender(client);
        Listener listener=new Listener(client);
        new Thread(sender).start();
        new Thread(listener).start();
    }
}
