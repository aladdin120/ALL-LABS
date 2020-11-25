package LAB23;

//Part 1 LAB23

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convertation {

    List<Object> list = new ArrayList<>();
    String[] array1 = {"Alex", "Ale", "Al", "A"};
    Integer[] array2 = {4, 3, 2, 1};

    Convertation() {
        System.out.println("Array of strings: "+ Arrays.toString(array1));
        System.out.println("Array of digits: "+ Arrays.toString(array2));

        Convert(array1);
        System.out.println("List generated from the array of strings: "+list);

        list.clear();

        Convert(array2);
        System.out.println("List generated from the array of digits: "+list);
    }


    private <T> void Convert(T[] arr) { list.addAll(Arrays.asList(arr)); }
}
