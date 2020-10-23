package LAB14;

public class Search implements Comporator{

    public Student Lineal(Student[] arr, int element) {
        for( int i = 0; i < arr.length; i++) {
            if(arr[i].id == element)
                return arr[i];
        }
        return null;
    }

    public int Binary(int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
