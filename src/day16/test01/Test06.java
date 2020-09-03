package day16.test01;

/**
 * @author 余俊锋
 * @date 2020/8/26 17:54
 */
public class Test06 {
    public static void main(String[] args) {
        invokeDirect(()->System.out.println("导演拍电影"));
        invokeDirect(()->{
            System.out.println("导演拍电影");
        });
        invokeDirect(new Director() {
            @Override
            public void makeMovie() {
                System.out.println("导演拍电影");
            }
        });
    }

    public  static void invokeDirect(Director director){
        director.makeMovie();
    }
}
