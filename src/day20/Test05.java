package day20;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 余俊锋
 * @date 2020/8/31 19:48
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //客户端
        Socket client=new Socket("192.168.1.146",6666);
        OutputStream os = client.getOutputStream();
        os.write("hello,我是客户端！".getBytes());
        os.flush();
        CloseUtiles.close(os,client);
    }
}
