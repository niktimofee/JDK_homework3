package homework.exceptions;

public class ArraysSizeException extends RuntimeException {

    public ArraysSizeException() {
        super("Array sizes are different");
    }
}