package day20.test01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 余俊锋
 * @date 2020/9/1 12:02
 */
public class Server01 {
    //服务器
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        ServerSocket serverSocket=new ServerSocket(8080);
        while (true){
            Socket client = serverSocket.accept();

         Thread thread=   new Thread(()->{
                try {
                    InputStream is = client.getInputStream();
                    byte[] buff=new byte[2*1024];
                    int index=-1;
                    while ((index=is.read(buff))!=-1){
                        String message=new String(buff,0,index);

                       Thread.sleep(2000);
                        System.out.println(Thread.currentThread().getName()+"收到的消息是："+message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            pool.submit(thread);
            pool.submit(thread);
        }

    }

}
