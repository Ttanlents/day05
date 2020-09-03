package day18.test03;

import day18.test01.CopyUtils;

import java.io.File;
import java.util.*;

/**
 * @author 余俊锋
 * @date 2020/8/28 14:28
 */
public class Test01 {
    static ArrayList<File> fileArrayList = new ArrayList<>();
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        CopyJavaFile("d:/day18", "d:/a");
        int sum = 0;
        for (Integer value : map.values()) {
            if (value != 1) {
                sum += (value - 1);
            }
        }
        System.out.println("文件重名的有：" + sum + "个");
    }

    public static void CopyJavaFile(String origin, String target) {
        File file = new File(origin);

        List<File> files = getFiles(file);
        System.out.println("需要拷贝的文件个数：" + files.size());
        for (File file1 : files) {
            String name = file1.getName();
            if (file1.isFile()) {
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + 1);
                    String prefix = name.split("\\.")[0];
                    String suffix = name.split("\\.")[1];
                    String uuid = UUID.randomUUID().toString();
                    CopyUtils.copyByByteArray(file1.getAbsolutePath(), target + "/" + prefix + uuid + "." + suffix);
                    continue;
                }
                CopyUtils.copyByByteArray(file1.getAbsolutePath(), target + "/" + name);
                map.put(name, 1);
            }
        }


    }

    public static List<File> getFiles(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".java")) {
                fileArrayList.add(file1);
                continue;
            }
            getFiles(file1);
        }
        return fileArrayList;
    }
}
