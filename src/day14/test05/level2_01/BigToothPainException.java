package day14.test05.level2_01;

public class BigToothPainException extends ToothPainException {
    public BigToothPainException() {
        this("大牙疼异常");
    }

    public BigToothPainException(String message) {
        super(message);
    }
}
