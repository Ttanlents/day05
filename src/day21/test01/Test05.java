package day21.test01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author 余俊锋
 * @date 2020/9/2 15:06
 */
public class Test05 {
    //day21.test01.A
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个需要被实例化A的类路径:");
        String input=br.readLine();
        Class<?> aClass = Class.forName(input);
        A a =(A) aClass.newInstance();
        a.showString();
    }
}
