package LAB24.PART2;

//part 2

public class AbstractFactory {

    int color;
    String material;
    String name;

    public AbstractFactory(int color, String material, String name) {
        this.color = color;
        this.material = material;
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
