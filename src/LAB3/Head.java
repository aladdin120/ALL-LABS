package LAB3;

public class Head {
    private String color;
    private String size;

    public Head(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void getInfo() {
        System.out.println("ГОЛОВА\n"+"Цвет: "+color+"\nРазмер: "+size+"\n");
    }
}
