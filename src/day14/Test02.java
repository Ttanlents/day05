package day14;

import java.util.HashMap;

/**
 * 证明Hashmap是线程是不安全的
 */

public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        HashMap<String, String> map = new HashMap<>();
        int num = 0;
        for (int i = 1; i <= 1000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                map.put(Thread.currentThread().getName(), "test");
            }, "" + num++).start();
        }
        while (true) {
            if (map.size()>=1000){
                break;
            }
            Thread.sleep(200);
            System.out.println(map.size());
        }
    }
}
