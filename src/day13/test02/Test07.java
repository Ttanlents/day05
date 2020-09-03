package day13.test02;

import java.util.*;

public class Test07 {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        Set<String> set1 = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.next();
        String[] a=inputMessage.split("");
        set1.addAll(Arrays.asList(a));
        set.addAll(set1);
        for (String s : set) {
            System.out.println(s);
        }
    }
}
