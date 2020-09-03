package day20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 余俊锋
 * @date 2020/8/31 19:26
 */
public class Test03_Server {
    public static void main(String[] args) throws Exception {
        client("jack");
    }
    public static void client(String msg) throws Exception{
        System.out.println("初始化客户端");
        DatagramSocket datagramSocket = new DatagramSocket();
        InetAddress localhosts = InetAddress.getByName("localhost");
        byte[] buff;
        buff=msg.getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(buff,0,buff.length,localhosts,8080);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
