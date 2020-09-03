package day19.test01;

import java.io.*;
import java.util.Scanner;

/**
 * @author 余俊锋
 * @date 2020/8/29 11:53
 */
public class Test04 {
    public static void main(String[] args) {
        write("Module1/a.txt");
        read("Module1/a.txt");
    }

    public static void write(String path)  {
        File file=new File(path);
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter(file));
            Scanner scanner=new Scanner(System.in);
            while (true){
                System.out.println("请输入一个验证码，输入end结束");
                String input=scanner.next();
                if (input.equals("end")){
                    break;
                }
                bw.write(input);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public static void read(String orgin){
        BufferedReader br=null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入验证码:");
        String code=scanner.next();
        try {
            br=new BufferedReader(new FileReader(orgin));
            String input="";
            while (true){
                if ((input=br.readLine())!=null){
                    if (code.equals(input)){
                        System.out.println("验证成功！");
                        break;
                    }
                    continue;
                }
                System.out.println("验证失败");
                break;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

