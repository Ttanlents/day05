package day17.test03;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 余俊锋
 * @date 2020/8/27 18:10
 */
public class Test03 {
    public static void main(String[] args) {
        Map<String,Integer> map=getFile(new File("d:/a.txt"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public static Map<String,Integer> getFile(File file){
        Map<String, Integer> map = new HashMap<>();
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
            if (file1.isFile()){
                String name=file1.getName();
               int index= name.indexOf(".");
                String filename=name.substring(index+1);
                System.out.println(filename);
                if (!map.containsKey(filename)){
                    map.put(filename,1);
                }else {
                    map.put(filename,map.get(filename)+1);
                }

            }else {
                getFile(file1);
            }

        }
        return map;
    }
}
