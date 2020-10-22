package LAB14;

public class Student {

    public int id;
    public double gpa;
    public String name;

    public Student(int id, double gpa, String name) {
        this.id = id;
        this.gpa = gpa;
        this.name = name;
    }

    public boolean equals(Student obj) {
        return (this == obj);
    }
}
