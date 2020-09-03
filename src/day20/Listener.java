package day20;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 余俊锋
 * @date 2020/9/1 9:48
 */
public class Listener implements Runnable {
    InputStream is;
    Socket client;
    OutputStream os;
    public Listener(Socket client) throws IOException {
        this.is=client.getInputStream();
        this.client=client;
        this.os=client.getOutputStream();
    }

    @Override
    public void run() {
        byte[] buff = new byte[1024];
        while (true) {
            int length = 0;
            try {
                length = is.read(buff);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String message = "";
            message = new String(buff, 0, length);
            if (!message.equals("")) {
                System.out.println(message);
            }
            if (message.equals("exit")) {

                return;
            }

        }
    }
}
