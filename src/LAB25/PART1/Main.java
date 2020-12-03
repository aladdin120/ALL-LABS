package LAB25.PART1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Student student = new Student(123, 3.56, "Alex", dateFormat.parse("16-07-2001"));
        System.out.println(student.toString("small"));
        System.out.println(student.toString("medium"));
        System.out.println(student.toString("full"));
    }
}
