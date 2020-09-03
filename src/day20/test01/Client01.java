package day20.test01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 余俊锋
 * @date 2020/9/1 12:10
 */
public class Client01 {
    public static void main(String[] args) throws IOException {
        //客户端

        for (int i = 0; i < 10; i++) {
            Socket client = new Socket("localhost", 8080);
            OutputStream os = client.getOutputStream();
            os.write(("客户端"+i).getBytes());
            os.flush();
            os.close();
            client.close();

        }

    }
}
