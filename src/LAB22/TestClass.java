package LAB22;

import LAB13.SortingByGPA;
import LAB13.Student;

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
    }

    public String output() {
        name = id = gpa = "";
        for(int i = 0; i < 5; i++) {
            name += "Student "+array[i].getName()+"    ";
            id += "ID: "+array[i].getId()+"          ";
            gpa += "GPA: "+array[i].getGpa()+"       ";
        }
        return "<html><pre>"+name+"<br>"+id+"<br>"+gpa+"</pre></html>";
    }

    public void SortByID() {

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId() > o2.getId() ? 1 : -1;
            }
        };
        Arrays.sort(array, comparator);
    }

    public void SortByGPA() {
        SortingByGPA t1 = new SortingByGPA();
        Arrays.sort(array, t1);
    }

    public String FindStudent(String name) {
        for(int i = 0; i < 5; i++) {
            if (array[i].getName().equals(name))
                return "Such student exists";
        }
        return null;
    }

}
