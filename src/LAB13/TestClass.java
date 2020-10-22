package LAB13;

import java.util.Arrays;

public class TestClass {

    Student[] array = new Student[5];
    int[] IDNumber = new int[5];
    double[] GPA = new double[5];
    String[] names = {"Alex", "Lila", "Ivan", "Dima", "Kate"};
    String name, id, gpa;
    SortingStudentsByGPA t1 = new SortingStudentsByGPA();


    public TestClass() {
        for(int i = 0; i < 5; i++) {
            array[i] = new Student((int) (Math.random() * 100), Math.round((Math.random()*5)*100)/100D, names[i]);
            IDNumber[i] = array[i].id;
            GPA[i] = array[i].gpa;
        }
        System.out.println("Original list of Students");
        output();
        SortByID();
        t1.QuickSort(GPA, 0, GPA.length-1);
        t1.MergeSort(GPA, 0, GPA.length-1);
        SortByGPA();
    }

    public void output() {
        name = id = gpa = "";
        for(int i = 0; i < 5; i++) {
            name += "Student "+array[i].name+"\t";
            id += "ID: "+array[i].id+"\t\t\t";
            gpa += "GPA: "+array[i].gpa+"\t\t";
        }
        System.out.println(name+"\n"+id+"\n"+gpa+"\n");
    }

    private void SortByID() {
        Arrays.sort(IDNumber);
        System.out.println("Sorting array IDNumber\n"+Arrays.toString(IDNumber)+"\n\nSorting list of Students by IDNumber");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++)
                if (IDNumber[i] == array[j].id) {
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        output();
    }

    private void SortByGPA() {
        System.out.println("Sorting array GPA by Quick and Merge sort\n"+Arrays.toString(GPA)+"\n\nSorting list of Students by GPA");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++)
                if (GPA[i] == array[j].gpa) {
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        output();
    }
}
