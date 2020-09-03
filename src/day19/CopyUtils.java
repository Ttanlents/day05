package day19;

import java.io.*;

/**
 * @author 余俊锋
 * @date 2020/8/28 12:22
 */
public class CopyUtils {
    static  FileInputStream is;
    static FileOutputStream os;
    static  BufferedInputStream bis;
    static BufferedOutputStream bos;
    static BufferedReader br;
    static BufferedWriter bw;

    /**
     * 检查文件源
     * @param orgin
     * @return
     */
    public static File checkOrgin(String orgin){
        File file=new File(orgin);
        if (!file.exists()){
           throw new FileException("源文件文件不存在");
        }
        return file;
    }

    /**
     * 通过byte拷贝数组
     * @param orgin
     * @param target
     */
    public static void copyByByte(String orgin,String target)  {
        checkOrgin(orgin);
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

    /**
     * 通过bye[] 拷贝文件
     * @param orgin
     * @param target
     */
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
            byte[] car=new byte[20*1024];
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

    /**
     * 拷贝一个目录中的全部文件  到另外一个目录
     * @param orgin
     * @param target
     */
    public static void CopyDirectFile(String orgin,String target){
        File file=checkOrgin(orgin);
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

    /**
     * 字节缓冲流拷贝文件 效率高
     * @param orgin
     * @param target
     */
    public static void CopyFileByBuff(String orgin,String target){
        File file=checkOrgin(orgin);
        try {
            is=new FileInputStream(file);
            os=new FileOutputStream(target);

            bis=new BufferedInputStream(is,8192);
            bos=new BufferedOutputStream(os);
            int buff;
            byte[] car=new byte[8*1024];
            while ((buff=bis.read(car))!=-1){
                bos.write(car,0,buff);
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

    /**
     * 字符缓冲流  拷贝文本文件
     * @param orgin
     * @param target
     */
    public static void copyFileByBuffRead(String orgin,String target){

        try {
             br=new BufferedReader(new FileReader(checkOrgin(orgin)));
             bw = new BufferedWriter(new FileWriter(new File(target)));
            String line=null;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            bw.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
