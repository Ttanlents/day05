package day19;

import java.io.*;
import java.util.HashMap;

/**
 * @author 余俊锋
 * @date 2020/8/31 12:14
 */
public class Test04 {
    public static void main(String[] args) throws Exception {

    }


    public static void  chushibiao() throws Exception {
        HashMap<Integer, String> map = new HashMap<>();
        BufferedReader bufis = new BufferedReader(new FileReader("Module1/a.txt"));
        BufferedWriter bufos = new BufferedWriter(new FileWriter("Module1/b.txt"));
        String index;
        while ((index = bufis.readLine()) != null) {
            String[]  message=index.split("\\.");
            map.put(Integer.parseInt(message[0]),message[1]);
        }
        for (int i = 1; i <= map.keySet().size(); i++) {
            bufos.write(map.get(i));
        }
        CloseUtiles.close(bufos, bufis);
    }
}
