package LAB14;

public class Search {

    public Student LinealSearch(Student[] arr, int element) {
        for( int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == element)
                return arr[i];
        }
        return null;
    }

    public Student BinarySearch(Student[] arr, int key, int low, int high) {
        Student index = new Student(-1,0,"");
        index.setId(-1);

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid].getId() < key) {
                low = mid + 1;
            } else if (arr[mid].getId() > key) {
                high = mid - 1;
            } else if (arr[mid].getId() == key) {
                index = arr[mid];
                break;
            }
        }
        return index;
    }


}

