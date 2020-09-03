package day14.test04;

public class NoScoreException extends RuntimeException{

    public NoScoreException() {
        this("分数异常");
    }

    public NoScoreException(String message) {
        super(message);
    }

}