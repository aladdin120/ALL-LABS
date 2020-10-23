package LAB13;

import java.util.Arrays;
import java.util.Comparator;

public class SortingByGPA  implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGpa() < o2.getGpa() ? 1 : -1;
    }
}
