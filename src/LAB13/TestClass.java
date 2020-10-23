package LAB13;

import java.util.Arrays;
import java.util.Comparator;

public class TestClass {

    Student[] array = new Student[5];
    Student[] arrayT;
    String[] names = {"Alex", "Lila", "Ivan", "Dima", "Kate"};
    String name, id, gpa;
    SortingByGPA t1 = new SortingByGPA();


    public TestClass() {
        for(int i = 0; i < 5; i++)
            array[i] = new Student((int) (Math.random() * 100), Math.round((Math.random()*5)*100)/100D, names[i]);
        System.out.println("Original list of Students");
        output();
        SortByID();
        SortByGPA();
    }

    public void output() {
        name = id = gpa = "";
        for(int i = 0; i < 5; i++) {
            name += "Student "+array[i].getName()+"\t";
            id += "ID: "+array[i].getId()+"\t\t\t";
            gpa += "GPA: "+array[i].getGpa()+"\t\t";
        }
        System.out.println(name+"\n"+id+"\n"+gpa+"\n");
    }

    private void SortByID() {

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }
        };
        Arrays.sort(array, comparator);
        System.out.println("\n\nSorting list of Students by IDNumber");
        output();
    }

    private void SortByGPA() {
        System.out.println("\n\nSorting list of Students by GPA");
        SortingByGPA t1 = new SortingByGPA();
        Arrays.sort(array, t1);
        output();
    }
}
