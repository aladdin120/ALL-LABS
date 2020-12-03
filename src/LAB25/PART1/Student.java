package LAB25.PART1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private int id;
    private double gpa;
    private String name;
    private Date bday;


    public Student(int id, double gpa, String name, Date bday) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
        this.bday = bday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBday(String category) {
        switch (category) {
            case "small": {
                SimpleDateFormat date = new SimpleDateFormat("dd-MM");
                return date.format(bday);
            }
            case "medium": {
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yy");
                return date.format(bday);
            }
            case "full": {
                SimpleDateFormat date = new SimpleDateFormat("dd-MMMM-yyyy");
                return date.format(bday);
            }
            default:
                throw new IllegalArgumentException("No such format:" + category);
        }
    }

    public String toString(String category) {
        return "Student{" +
                "id=" + id +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                ", bday=" + getBday(category) +
                '}';
    }
}
