package day19.test01;

import java.io.*;

/**
 * @author 余俊锋
 * @date 2020/8/29 11:47
 */
public class Test03 {

    public static void main(String[] args) {
         CopyFileByBuff("Module1/a.xtx","Module1/b.txt");
    }
    /**
     * 字节缓冲流拷贝文件 效率高
     * @param orgin
     * @param target
     */
    public static void CopyFileByBuff(String orgin,String target){
        FileInputStream is=null;
        FileOutputStream os=null;
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            is=new FileInputStream(orgin);
            os=new FileOutputStream(target);

            bis=new BufferedInputStream(is);
            bos=new BufferedOutputStream(os);
            int buff;
           // byte[] car=new byte[1024];
            while ((buff=bis.read())!=-1){
                bos.write(buff);
            }
            bos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
