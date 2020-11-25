package LAB23;

//Part 2 and 3 LAB23

import java.util.Arrays;

public class GenericMassive <T> {

    private T[] array;

    GenericMassive(T[] arr) {
        array = arr;

        System.out.println("Array in class: "+ Arrays.toString(array));
        System.out.println("Get array's element under index 3: "+GetElemByIndex(3));
    }

    public T[] getArray() {
        return array;
    }

    public T GetElemByIndex(int i) {
        return array[i];
    }
}
