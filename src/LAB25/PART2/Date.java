package LAB25.PART2;

import LAB22.Data;

public class Date {

    private int year, month, day;

    public Date(String date) {
        String[] split = date.split("\\.");
        this.year = Integer.parseInt(split[0]);
        this.month = Integer.parseInt(split[1]);
        this.day = Integer.parseInt(split[2]);
    }

    @Override
    public String toString() {
        return  day + "." + month + "." + year;
    }
}
