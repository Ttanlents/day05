package day09.test4;

public class Test {
    public static void main(String[] args) {
        OldPhone oldPhone=new OldPhone();
        oldPhone.call();
        oldPhone.sendMessage();
        NewPhone newPhone=new NewPhone();
        newPhone.playGame();
        newPhone.call();
        newPhone.sendMessage();
    }
}
