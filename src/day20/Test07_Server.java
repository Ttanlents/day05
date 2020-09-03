package day20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 余俊锋
 * @date 2020/9/1 16:34
 */
public class Test07_Server {
    public static void main(String[] args) throws IOException {
        //服务器
        System.out.println("服务器");
        ServerSocket serverSocket = new ServerSocket(8080);
        ExecutorService service = Executors.newFixedThreadPool(5);
        while (true) {

            Socket client = serverSocket.accept();
            System.out.println("建立连接");
            Thread thread = new Thread(() -> {
                System.out.println("开启线程处理");
                BufferedInputStream bis = null;
                BufferedOutputStream bos = null;
                BufferedOutputStream bos2 = null;
                try {
                    bis = new BufferedInputStream(client.getInputStream());
                    bos2 = new BufferedOutputStream(client.getOutputStream());
                    String prefix = UUID.randomUUID().toString().replace("-", "");
                    String suffix = ".txt";
                    bos = new BufferedOutputStream(new FileOutputStream("D:/a/" + prefix + suffix));
                } catch (IOException e) {
                    System.out.println(".......");
                    e.printStackTrace();
                }

                try {
                    byte[] buff = new byte[8 * 1024];
                    int len;
                    while ((len = bis.read(buff)) != -1) {
                        bos.write(buff, 0, len);
                        bos.flush();
                        System.out.println("刷新完成");
                    }
                    System.out.println("上传成功");

                    //信息写回
                    bos2.write("恭喜上传成功！".getBytes());
                    bos2.flush();
                    bos2.close();
                    CloseUtiles.close( bos, bis, client);

                } catch (IOException e) {
                    e.printStackTrace();
                }

            });
            service.submit(thread);
        }

    }
}
