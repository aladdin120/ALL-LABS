package LAB14;

import java.util.Arrays;

public class TestClass {

    LAB14.Student[] array = new LAB14.Student[5];
    Student test = null;
    int[] IDNumber = new int[5];
    double[] GPA = new double[5];
    String[] names = {"Alex", "Lila", "Ivan", "Dima", "Kate"};
    String name, id, gpa;
    Search search = new Search();


    public TestClass() {
        for(int i = 0; i < 5; i++) {
            array[i] = new Student((int) (Math.random() * 100), Math.round((Math.random()*5)*100)/100D, names[i]);
            IDNumber[i] = array[i].id;
            GPA[i] = array[i].gpa;
        }
        System.out.println("Original list of Students");
        output();
        long start = System.nanoTime();
        test = search.Lineal(array, array[2].id);
        long finish = System.nanoTime();
        output(test, finish-start);
        SortByID();
        start = System.nanoTime();
        int num = search.Binary(IDNumber, array[3].id, 0, array.length-1);
        finish = System.nanoTime();
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

    public void output(Student student, long time) {
        System.out.println("Search student with ID "+student.id+"");
        if (student == null) {
            System.out.println("No student with such ID\n");
            return;
        }
        name = id = gpa = "";
        name += "Student "+student.name+"\t";
        id += "ID: "+student.id+"\t\t\t";
        gpa += "GPA: "+student.gpa+"\t\t";
        System.out.println(name+"\n"+id+"\n"+gpa+"\n"+"Time of search: "+time+" nanoseconds\n");
    }

    private void SortByID() {
        Arrays.sort(IDNumber);
        System.out.println("Sorting array IDNumber\n"+Arrays.toString(IDNumber)+"\n\nSorting list of Students by IDNumber");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++)
                if (IDNumber[i] == array[j].id) {
                    LAB14.Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        output();
    }

}
