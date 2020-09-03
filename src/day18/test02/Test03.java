package day18.test02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/28 14:10
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println(getCount('2'));
    }

    public static int getCount(char input){
        FileInputStream is=null;
        try {
            is=new FileInputStream("Module1/b.txt");
            byte[] car=new byte[1024];
            int index=-1;
            StringBuilder sb=new StringBuilder();
            while ((index=is.read(car))!=-1){
                sb.append(new String(car,0,index));
            }
            char[] target= sb.toString().toCharArray();
            int count=0;
            for (char c : target) {
                if (c==input){
                    count++;
                }
            }
            return count;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return 0;
    }
}
