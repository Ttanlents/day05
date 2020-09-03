package day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author 余俊锋
 * @date 2020/9/1 9:54
 */
public class Sender implements Runnable {
    OutputStream os;
    BufferedReader br;
    Socket client;

    public Sender(Socket client) throws IOException {
        this.os = client.getOutputStream();
        this.br=new BufferedReader(new InputStreamReader(System.in));
        this.client=client;
    }


    @Override
    public void run() {
        while (true){
            try {
             String message= br.readLine();
             if (message!=null){
                 os.write(message.getBytes());
                 os.flush();
                 if (message.equals("exit")){

                     return;
                 }
             }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
