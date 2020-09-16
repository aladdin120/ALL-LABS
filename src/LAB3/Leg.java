package LAB3;

public class Leg {
    private String length;
    private boolean isHairy;

    public Leg(String length, boolean isHairy) {
        this.length = length;
        this.isHairy = isHairy;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public boolean isHairy() {
        return isHairy;
    }

    public void setHairy(boolean hairy) {
        isHairy = hairy;
    }

    public String Hair(boolean isHairy) {
        if (isHairy){
            return "Да";
        }else {
            return "Нет";
        }
    }

    public void getInfo() {
        System.out.println("Нога\nДлинна: "+length+"\nВолосатая: "+ Hair(isHairy)+"\n");
    }
}
