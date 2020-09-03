package day14.test05.level2_01;

/**
 * 疼痛异常
 */
public class PainException extends Exception {
    public PainException() {
        this("疼痛异常");
    }


    public PainException(String message) {
        super(message);
    }
}
