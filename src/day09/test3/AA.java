package day09.test3;

public interface AA {
    public void showA();

    //private
    default void show10(String str){
        for (int i = 0; i < 10; i++) {
            System.out.print(str+"\t");
        }
    }

    default void showB10(){
        System.out.println();
        show10("BBBB");
    }
    default void showC10(){
        System.out.println();
        show10("CCCC");
    }
}
