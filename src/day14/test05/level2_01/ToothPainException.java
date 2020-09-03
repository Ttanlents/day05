package day14.test05.level2_01;

public class ToothPainException extends PainException {
    public ToothPainException() {
        this("牙疼异常");
    }

    public ToothPainException(String message) {
        super(message);
    }
}
