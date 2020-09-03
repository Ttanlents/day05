package day20;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author 余俊锋
 * @date 2020/8/31 18:59
 */
public class Test03_Client {
    public static void main(String[] args) throws Exception {
       server();
    }
    public static void server() throws  Exception{
        System.out.println("初始化服务器。。。。");
        DatagramSocket datagramSocket = new DatagramSocket(8080);
        byte[] buff=new byte[1024*3];
        DatagramPacket datagramPacket = new DatagramPacket(buff,buff.length);
        datagramSocket.receive(datagramPacket);
        String message=new String(datagramPacket.getData(),0,datagramPacket.getLength());
        System.out.println(message);
        datagramSocket.close();
    }

}



