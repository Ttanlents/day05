package day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 余俊锋
 * @date 2020/9/1 19:38
 */
public class Test09_Server {
    public static void main(String[] args) throws IOException {
        //服务器
        System.out.println("服务器");
        ServerSocket serverSocket = new ServerSocket(8080);
        ExecutorService service = Executors.newFixedThreadPool(2);
        while (true) {

            Socket client = serverSocket.accept();
            System.out.println("建立连接");
            Thread thread = new Thread(() -> {
                System.out.println("开启线程处理");

                BufferedOutputStream bos = null;
                BufferedInputStream bis=null;
                try {
                    bos = new BufferedOutputStream(client.getOutputStream());
                    bis=new BufferedInputStream(new FileInputStream("Module1/a.png"));
                    byte[] buff = new byte[8 * 1024];
                    int len;
                    while ((len=bis.read(buff))!=-1){
                        System.out.println("读取文件信息，返回文件信息");
                        bos.write(buff,0,len);
                        bos.flush();
                    }
                    System.out.println("上传成功");


                    CloseUtiles.close(bos, bis, client);

                } catch (IOException e) {
                    System.out.println(".......");
                    e.printStackTrace();
                }


            });
            service.submit(thread);
        }

    }
}
