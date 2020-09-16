package LAB3;

public class Hand {
    private String length;
    private boolean isHairy;
    private boolean isBig;

    public Hand(String length, boolean isHairy, boolean isBig) {
        this.length = length;
        this.isHairy = isHairy;
        this.isBig = isBig;
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

    public boolean isBig() {
        return isBig;
    }

    public void setBig(boolean big) {
        isBig = big;
    }

    public String Hair(boolean isHairy) {
        if (isHairy){
            return "Да";
        }else {
            return "Нет";
        }
    }

    public String Big(boolean isBig) {
        if (isBig){
            return "Да";
        }else {
            return "Нет";
        }
    }

    public void getInfo() {
        System.out.println("Рука\nДлинна: "+length+"\nВолосатая: "+ Hair(isHairy)+"\nБольшая: "+Big(isBig));
    }
}
