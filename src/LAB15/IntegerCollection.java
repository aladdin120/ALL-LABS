package LAB15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerCollection {

    private List<Integer> array;

    public IntegerCollection() {
        array = new ArrayList<>();
    }

    public void push(int data) {
        array.add(data);
        System.out.printf("Element %d successfully add to collection\n", data);
    }

    public void delete(int data) {
        if(array.contains(data)) {
            int index = array.indexOf(data);
            array.remove(index);
            System.out.printf("Element %d successfully delete from collection\n", data);
        } else
            System.out.printf("Element %d is not contained in the collection\n", data);
    }

    public  boolean search(int data) {
        if(array.contains(data)) {
            System.out.printf("Index of element %d is %d\n", data, array.indexOf(data));
            return true;
        }
        System.out.printf("Element %d is not contained in the collection\n", data);
        return false;
    }

    public boolean searchForIndex(int index) {
        if(array.size() >= index) {
            System.out.printf("Under index %d is the element %d\n", index, array.get(index));
            return true;
        }
        System.out.printf("Under index %d is not element\n", index);
        return false;
    }

    public int maxElem() {
        if(array.isEmpty()) {
            System.out.println("Collection is empty\n");
            return 0;
        }
        else {
            int max = Collections.max(array);
            System.out.printf("Maximum element in collection is %d\n", max);
            return max;
        }
    }

    public int minElem() {
        if(array.isEmpty()) {
            System.out.println("Collection is empty\n");
            return 0;
        }
        else {
            int min = Collections.min(array);
            System.out.printf("Minimum element in collection is %d\n", min);
            return min;
        }
    }

    public int average() {
        if(array.isEmpty()) {
            System.out.println("Collection is empty\n");
            return 0;
        }
        else {
            int average = 0;
            for(int i : array)
                average += i;
            System.out.printf("Average of all elements of collections %d\n", average);
            return average;
        }
    }

    public void print() {
        System.out.println("Elements of collection:\n"+array);
    }
}
