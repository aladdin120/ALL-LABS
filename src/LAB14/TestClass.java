package LAB14;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass {

    LAB14.Student[] array = new LAB14.Student[5];
    LAB14.Student temp = null;
    String[] names = {"Alex", "Lila", "Ivan", "Dima", "Kate"};
    String name, id, gpa;


    public TestClass() {
        for(int i = 0; i < 5; i++)
            array[i] = new LAB14.Student((int) (Math.random() * 100), Math.round((Math.random()*5)*100)/100D, names[i]);
        SearchID(array[2].getId());
        SortByGPA();
    }

    public void output(long time) {
        name = id = gpa = "";
        for(int i = 0; i < 5; i++) {
            name += "Student "+array[i].getName()+"\t";
            id += "ID: "+array[i].getId()+"\t\t\t";
            gpa += "GPA: "+array[i].getGpa()+"\t\t";
        }
        System.out.println(name+"\n"+id+"\n"+gpa+"\n");
        System.out.println("Time of sort: "+time+" nanoseconds\n");
    }

    public void output(Student student, long time) {
        System.out.println("Search student with ID "+student.getId()+"");
        name = id = gpa = "";
        name += "Student "+student.getName()+"\t";
        id += "ID: "+student.getId()+"\t\t\t";
        gpa += "GPA: "+student.getGpa()+"\t\t";
        System.out.println(name+"\n"+id+"\n"+gpa+"\n"+"Time of search: "+time+" nanoseconds\n");
    }

    private void SearchID(int element) {
        Search search = new Search();

        long start = System.nanoTime();
        temp = search.BinarySearch(array, element, 0, array.length-1);
        long finish = System.nanoTime();
        System.out.println("\nBinary Search, algorithm complexity: O(log n), time: O(log n)");
        output(temp, finish-start);

        SortByID();
        start = System.nanoTime();
        temp = search.LinealSearch(array, element);
        finish = System.nanoTime();
        System.out.println("Lineal Search, algorithm complexity: O(n), time: O(n)");
        output(temp, finish-start);
    }

    private void SortByGPA() {
        Sort sort = new Sort();
        System.out.println("\n\nSorting list of Students by GPA");

        long start = System.nanoTime();
        sort.QuickSort(array, 0, array.length-1);
        long finish = System.nanoTime();
        System.out.println("Quick Sort, algorithm complexity: O(n log n), time: O(n log n)");
        output(finish-start);

        start = System.nanoTime();
        sort.MergeSort(array, 0, array.length-1);
        finish = System.nanoTime();
        System.out.println("Merge Sort, algorithm complexity: O(n), time: O(n log n)");
        output(finish-start);
    }

    private void SortByID() {

        Comparator<LAB14.Student> comparator = new Comparator<LAB14.Student>() {
            @Override
            public int compare(LAB14.Student o1, LAB14.Student o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }
        };
        Arrays.sort(array, comparator);
    }
}