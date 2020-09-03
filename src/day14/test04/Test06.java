package day14.test04;

public class Test06 {
    public static void main(String[] args) throws Exception {
            testTrycach();
    }
    public static char cahrAt(String str,int index)throws Exception {
        if (str==null){
            throw new Exception("字符串不能为null");
        }
        if (str.equals("")){
            throw new Exception("字符串不能为空");
        }
        if (index<0||index>str.length()){
            throw new Exception("索引越界");
        }

        return str.toCharArray()[index];
    }

    public static void testThrows()throws Exception{
        System.out.println(cahrAt("abcde",5));
    }

    public static void testTrycach(){
        try {
            cahrAt("abcd",5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
