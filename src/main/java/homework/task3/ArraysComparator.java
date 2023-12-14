package homework.task3;

import homework.exceptions.ArraysSizeException;
import homework.exceptions.ArraysTypeException;

import java.util.Arrays;

public class ArraysComparator {
    public <E, T> boolean compareArrays(E[] array1, T[] array2) throws ArraysSizeException, ArraysTypeException {
        if (array1.length != array2.length) throw new ArraysSizeException();
        if (array1.getClass() != array2.getClass()) throw new ArraysTypeException();
        return Arrays.equals(array1, array2);
    }
}