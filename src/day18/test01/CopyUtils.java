package day18.test01;

import java.io.*;

/**
 * @author 余俊锋
 * @date 2020/8/28 12:22
 */
public class CopyUtils {
    static  FileInputStream is;
    static FileOutputStream os;
    public static void copyByByte(String orgin,String target)  {
        try {
            is=new FileInputStream(orgin);
            os=new FileOutputStream(target);
            int index=-1;
            while ((index=is.read())!=-1){
                os.write(index);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    public static void copyByByteArray(String orgin,String target)  {
        File file=new File(target);
        File file1=new File(file.getParent());
        if (!file1.exists()){
            file1.mkdirs();
        }
        try {
            is=new FileInputStream(orgin);
            os=new FileOutputStream(target);
            int index=-1;
            byte[] car=new byte[10*1024];
            while ((index=is.read(car))!=-1){
                os.write(car,0,index);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public static void CopyDirectFile(String orgin,String target){
        File file=new File(orgin);
        File[] files = file.listFiles();
        for (File file1 : files) {
            String orginPath=file1.getAbsolutePath();
            String targetPath=target+"/"+file1.getName();
            if (file1.isFile()){
                copyByByteArray(orginPath,targetPath);
            }else {
                File file2=new File(targetPath);
                file2.mkdirs();
                CopyDirectFile(orginPath,file2.getAbsolutePath());
            }
        }
    }
}
