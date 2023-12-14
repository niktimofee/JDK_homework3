package homework.exceptions;

public class DivideByZeroException extends ArithmeticException {

    public DivideByZeroException() {
        super("You can't divide by zero");
    }
}