package LAB25.PART3;

import java.util.Date;

public class Dev {

    private String surname;
    private Date start, end;

    public Dev(String surname) {
        this.surname = surname;
        this.start = new Date();
        this.end = new Date(System.currentTimeMillis()+3600000);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "surname='" + surname + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
