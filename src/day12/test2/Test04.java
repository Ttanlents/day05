package day12.test2;

import java.util.Arrays;

public class Test04<E> {
    public static void main(String[] args) {
        String[] ss=  new Test04<String>().swap(new String[]{"a","b","c"},0,2);
        System.out.println(Arrays.toString(ss));
        Integer[] sss=  new Test04<Integer>().swap(new Integer[]{1,2,3},0,2);
        System.out.println(Arrays.toString(sss));
    }

    public  E[] swap(E[] e,int a,int b ){
        if (e.length-a<0||e.length-b<0){
          throw new RuntimeException();
        }
        E temp=e[a];
        e[a]=e[b];
        e[b]=temp;
        return e;
    }
}
