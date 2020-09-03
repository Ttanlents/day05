package day14.test05.level2_01;

public class TonguepainException extends PainException {
    public TonguepainException() {
        this("舌头疼异常");
    }

    public TonguepainException(String message) {
        super(message);
    }
}
