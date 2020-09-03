package day13.test02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test08 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            if (input.equals("-1")) {
                break;
            }
            set.add(Integer.parseInt(input));
        }
        int sum = 0;
        for (Integer integer : set) {
            sum += integer;
        }

        System.out.println("总和是： " + sum);
    }
}
