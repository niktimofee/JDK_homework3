package homework.exceptions;

public class ArraysTypeException extends RuntimeException {

    public ArraysTypeException() {
        super("Array types are different");
    }
}