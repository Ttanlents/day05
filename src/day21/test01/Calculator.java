package day21.test01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 余俊锋
 * @date 2020/9/2 14:34
 */
public class Calculator {
    Calculator calculator;

    @Test
    public void add(){
        System.out.println("加");
    }
    @Test
    public void delete(){
        System.out.println("减");
        System.out.println(calculator);
    }
    @Test
    public void mutiply(){
        System.out.println("乘");
    }
    @Test
    public void div(){
        System.out.println("除");
    }
    @Before
    public void newInstance(){
        this.calculator=new Calculator();
    }
    @After
    public  void setCalculator(){
        this.calculator=null;
    }
}
