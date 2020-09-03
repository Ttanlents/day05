package day17;

import java.io.File;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/27 10:12
 *
 * 文件类构造器：public File(String pathname)
 *            常用方法：getAbsolutePath() 绝对路径
 *                      getPath()       相对路径
 *                      g getName()    文件名
 *                      length()     文件大小
 *                      createNewFile()`创建文件
 *                      delete()`删除
 *                      mkdir()`创建文件目录
 *                       mkdirs()`同父目录一起创建目录
 *                        list()`文件列表名数组
 *                        listFiles()`文件数组集合
 *
 *       递归：在当前方法中调用自己。
 *              常用递归：直接递归，直接递归称为方法自身调用自己。
 *                          间接递归，间接递归可以A方法调用B方法，B方法调用C方法
 *               注意：递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
 *
 *               使用递归，递归打印多级目录
 *
 *        文件过滤器：Filefilter
 *                     使用，`listFiles(FileFilter)`
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        System.out.println(file.getName());
        //绝对路径
        System.out.println(file.getAbsolutePath());
        //相对路径
        System.out.println(file.getPath());
        //文件字节大小
        System.out.println(file.length());
        //当前项目路径
        System.out.println(System.getProperty("user.dir"));
        //是否存在
        System.out.println("存在"+file.exists());
        //是否是目录
        System.out.println("文件"+file.isFile());
        System.out.println("目录"+file.isDirectory());
        File file1=new File("Module1\\src\\day17/Readme.md");
        file1.createNewFile(); //创建文件
        file1.delete(); //删除文件  如果删除目录，必须是个不包含文件的文件夹
        file1.mkdir();//创建一个文件夹
        file1.mkdirs();//创建文件夹父目录

        file1.list(); //遍历当前目录的文件或目录名称
        file1.listFiles();//获取当前目录下的文件对象  ,根据此方法手动写一个递归遍历目录

        File file2=new File("Module1\\src");
        for (File listFile : file2.listFiles()) {
            System.out.println( listFile.getName());
        }


    }
}
