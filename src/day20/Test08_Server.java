package day20;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author 余俊锋
 * @date 2020/9/1 18:01
 */
public class Test08_Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8080);
        while (true){
            Socket client = server.accept();
            System.out.println("建立连接");
            new Thread(()->{
                BufferedReader bread=null;
                BufferedWriter bwrite=null;
                BufferedInputStream bis=null;
                BufferedOutputStream bos=null;
                try {
                    //查询本地文件流
                     bread=new BufferedReader(new FileReader("Module1/a.txt"));

                    //读取客户端信息流
                     bis=new BufferedInputStream(client.getInputStream());
                    //反馈流
                     bos=new BufferedOutputStream(client.getOutputStream());
                     byte[] buff=new byte[8*1024];
                     int len=-1;
                     String arrs="";
                     while ((len=bis.read(buff))!=-1){
                          arrs=new String(buff,0,len);
                     }
                    System.out.println("执行到这里吗");
                    String[] arr=arrs.split("=");

                    String name=arr[0];
                    String password=arr[1];
                    System.out.println(name+password);

                    Map<String,String> map=new HashMap<>();
                    String content;
                    while ((content=bread.readLine())!=null){
                        String a=content.split("=")[0];
                        String b=content.split("=")[1];
                        map.put(a,b);
                    }

                    if (map.containsKey(name)){
                        if (Objects.equals(password,map.get(name))){
                            System.out.println("提示登陆成功");
                            bos.write("恭喜登录成功！".getBytes());
                            bos.flush();
                        }else {
                            System.out.println("提示密码错误");
                            bos.write("很抱歉，密码错误！".getBytes());
                            bos.flush();

                        }
                    }else {
                        //写入本地文件流
                        bwrite=new BufferedWriter(new FileWriter("Module1/a.txt",true));
                        bwrite.write(name+"="+password);
                        bwrite.flush();
                        bos.write("很抱歉，你还没有注册账号！！！".getBytes());
                        bos.write("已经为你填写的账号密码注册成功！".getBytes());
                        bos.flush();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    System.out.println("执行finally关闭io流");
                    try {

                        bread.close();
                        client.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
