package day14.test05.level2_01;

public class FrontToothPainException extends ToothPainException {
    public FrontToothPainException() {
        this("门牙牙疼异常");
    }

    public FrontToothPainException(String message) {
        super(message);
    }
}
